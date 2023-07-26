package com.AudioHub.User_Services;


import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/users/")
public class userServicesController {

    @PostMapping(path = "saveuser")
    public String GetSongs(@RequestBody UserDto newuser){
        UserDto user = new UserDto (
                UserDto.setPassword =newuser.getUsername(),
                UserDto.password= newuser.getPassword(),
                UserDto.username=newuser.getUsername()
        );

      // UserRepo.save(user);
        System.out.println(user);
        return "Hello user "+ user.getUsername() + "You are logged in with the pasword" + user.getPassword()  ;
    }

}
