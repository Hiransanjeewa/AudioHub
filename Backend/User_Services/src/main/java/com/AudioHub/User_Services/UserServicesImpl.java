package com.AudioHub.User_Services;

public class UserServicesImpl implements UserServices{

    @Override
    public String saveuser(UserDto userDto) {

//        BCryptPasswordEncoder bCrypt= new BCryptPasswordEncoder();
//        String encPassword=bCrypt.encode(UserDto.getPassword());

        Users users = new Users(




        );

        return "Welcome"+users.getUsername()+" please sign into your account";
    }
}
