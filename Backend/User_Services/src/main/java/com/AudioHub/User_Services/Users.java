package com.AudioHub.User_Services;


import jakarta.persistence.*;

@Entity
@Table(name = "Users")

public class Users {

    @Id
    @Column(name = "userid",length = 5)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    @Column(name = "username",length = 20,nullable = false)
    private String username;

    @Column(name = "secondName",length = 30,nullable = false)
    private String firstName;





}