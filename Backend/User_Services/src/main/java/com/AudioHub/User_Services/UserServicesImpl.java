package com.AudioHub.User_Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserServicesImpl implements UserServices{


    @Autowired
    private UserRepo userRepo;
    @Override
    public String saveuser(UserDto userDto) {


        //System.out.println("******");

        BCryptPasswordEncoder bCrypt= new BCryptPasswordEncoder();

        if (userRepo.checkUserName(userDto.getUsername())==0){
            if (userRepo.checkUserEmail(userDto.getEmail())==0){
                String encPassword = bCrypt.encode(userDto.getPassword());

                Users users = new Users(
                        userDto.getUserid(),
                        userDto.getUsername(),
                        userDto.getEmail(),
                        userDto.getPassword()
                );
                users.setPassword(encPassword);
                userRepo.save(users);
                return "Welcome "+users.getUsername()+", please sign into your account";
            }else {
                return "Your email already have an account";
            }
        } else {
            return "Your username is already taken. Try different username";
        }

    }

}
