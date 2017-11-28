package com.example.ahmadrizaldi.traveloka_retrofit.CRUDUser;

import com.example.ahmadrizaldi.traveloka_retrofit.Model.User;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ahmadrizaldi on 11/28/17.
 */

public class CRUDUser {

    @SerializedName("status")
    String status;
    @SerializedName("result")
    User mPembelian;
    @SerializedName("message")
    String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getmPembelian() {
        return mPembelian;
    }

    public void setmPembelian(User mPembelian) {
        this.mPembelian = mPembelian;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
