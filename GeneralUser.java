package com.projet.Cinema.model;

import javax.persistence.Column;

public class GeneralUser {

    @Column
    private String UserName;
    @Column
    private int Password;


    public String getUserName() {
        return UserName;
    }

    public void setId(String UserName) {
        this.UserName = UserName;
    }

    public int getPassword() {
        return Password;
    }

    public void setPassword(int Password) {this.Password = Password;}
}

