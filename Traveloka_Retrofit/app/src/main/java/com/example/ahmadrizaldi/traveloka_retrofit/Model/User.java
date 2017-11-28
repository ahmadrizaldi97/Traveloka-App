package com.example.ahmadrizaldi.traveloka_retrofit.Model;

/**
 * Created by ahmadrizaldi on 11/28/17.
 */

import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("id_user")
    private String id_user;
    @SerializedName("email")
    private String email;
    @SerializedName("password")
    private String passowrd;

    public User() {
    }

    public User(String id_user, String email, String passowrd) {
        this.id_user = id_user;
        this.email = email;
        this.passowrd = passowrd;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassowrd() {
        return passowrd;
    }

    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd;
    }
}
