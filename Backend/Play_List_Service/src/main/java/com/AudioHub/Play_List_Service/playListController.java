package com.AudioHub.Play_List_Service;


import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/playlist/")
public class playListController {

    @PostMapping(path = "getlist")
    public String RemoveItemfromCart(@RequestParam Integer userid){
        return "Hello user this is your Playlist"+ userid;
    }

}
