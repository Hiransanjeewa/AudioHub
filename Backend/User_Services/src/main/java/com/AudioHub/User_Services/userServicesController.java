package com.AudioHub.User_Services;


import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/users/")
public class userServicesController {


    private UserRepo userRepo;
    private  UserServices userServices;
    @PostMapping(path = "saveuser")
    public String GetSongs(@RequestBody UserDto userDto){
//        Users user = new Users (
//
//        );

        String Output = userServices.saveuser(userDto);


      // UserRepo.save(user);
        System.out.println(Output);
        return Output ;
    }

}
