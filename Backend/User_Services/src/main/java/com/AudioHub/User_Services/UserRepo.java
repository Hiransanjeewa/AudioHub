package com.AudioHub.User_Services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface UserRepo  extends  JpaRepository <UserDto, Integer> {


    @Query(value="select * from Users where username=:username", nativeQuery=true)
    UserDto checkUser (String username);


    @Modifying
    @Query(value="insert into Users VALUES (?1,)", nativeQuery=true)
    Integer saveOtp(String email,Integer otp);




    @Modifying
    @Query(value="delete from otps where email=:email", nativeQuery=true)
    void deletePreviousOtp(String email);

}
