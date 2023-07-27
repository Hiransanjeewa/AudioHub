package com.AudioHub.User_Services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/users/")
public class userServicesController {


    @Autowired
    private UserServices saveuser ;

    @PostMapping(path = "saveuser")
    public String GetSongs(@RequestBody UserDto userDto){

        return  saveuser.saveuser(userDto);

    }
}
