package com.AudioHub.User_Services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserServicesImpl implements UserServices{

    private UserRepo userRepo;
    @Override
    public String saveuser(UserDto userDto) {

        System.out.println("******");

        BCryptPasswordEncoder bCrypt= new BCryptPasswordEncoder();
        String encPassword=bCrypt.encode(userDto.getPassword());

        Users users = new Users(
                userDto.getUserid(),
                userDto.getUsername(),
                userDto.getPassword(),
                userDto.getEmail()

        );
      //  userRepo.save(users);


        return "Welcome"+users.getUsername()+" please sign into your account";
    }
}
