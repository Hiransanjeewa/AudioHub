package com.AudioHub.User_Services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface UserRepo  extends  JpaRepository <Users, Integer> {

    @Query(value="select COUNT(*) from Users where username=:username", nativeQuery=true)
    int checkUserName (String username);

    @Query(value="select COUNT(*) from Users where email=:email", nativeQuery=true)
    int checkUserEmail (String email);



}
