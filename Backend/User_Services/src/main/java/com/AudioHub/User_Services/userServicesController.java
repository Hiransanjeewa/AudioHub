package com.AudioHub.User_Services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("api/users/")
public class userServicesController {




    private UserServices saveuser ;

    @PostMapping(path = "saveuser")
    public UserDto GetSongs(@RequestBody UserDto userDto){

        System.out.println(userDto.getPassword());
         saveuser.saveuser(userDto);

        return userDto;

      // UserRepo.save(user);
       // System.out.println(Output);
       // return Output ;
    }

}
