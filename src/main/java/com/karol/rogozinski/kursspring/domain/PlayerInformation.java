package com.karol.rogozinski.kursspring.domain;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import javax.persistence.*;


@Entity
public class PlayerInformation {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String username;

    private String password;

    private boolean enabled;

    private int gold = 0;

    @Transient
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public PlayerInformation() {
    }

    public PlayerInformation(String username, String password) throws Exception{

        String encodedPassword = encodePassword(password);
        this.username=username;
        this.password=encodedPassword;
        this.enabled = true;
    }

    public String encodePassword(String passwordToEncode) throws Exception{
       return passwordEncoder.encode(passwordToEncode);
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getGold() {
        return gold;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
