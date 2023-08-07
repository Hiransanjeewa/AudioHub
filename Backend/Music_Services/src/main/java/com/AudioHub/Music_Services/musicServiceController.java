package com.AudioHub.Music_Services;

import org.springframework.web.bind.annotation.*;



@RestController
@CrossOrigin
@RequestMapping("api/songs/")
public class musicServiceController {

    @GetMapping(path = "getsongs")
    public String GetSongs(@RequestParam Integer songid){
        System.out.println("controller started");
        return "Here is the song with the ID"+ songid;
    }


}
