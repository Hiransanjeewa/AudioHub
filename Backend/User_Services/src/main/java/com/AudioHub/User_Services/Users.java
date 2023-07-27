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

    @Column(name = "email",length = 30,nullable = false)
    private String email;

    @Column(name = "password",length = 200,nullable = false)
    private String password;


    public Users(int userId, String username, String email, String password) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Users() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}