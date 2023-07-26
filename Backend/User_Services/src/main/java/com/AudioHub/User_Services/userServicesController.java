package com.AudioHub.User_Services;


import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/songs/")
public class userServicesController {

    @PostMapping(path = "getsongs")
    public String GetSongs(@RequestBody String username,String password){
        return "Hello user "+ username + "You are logged in with the pasword" + password  ;
    }

}
