package com.example.ahmadrizaldi.traveloka_retrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ahmadrizaldi on 11/22/17.
 */

public class CRUDMaskapai {

    @SerializedName("status")
    String status;
    @SerializedName("result")
    Maskapai mPembelian;
    @SerializedName("message")
    String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Maskapai getmPembelian() {
        return mPembelian;
    }

    public void setmPembelian(Maskapai mPembelian) {
        this.mPembelian = mPembelian;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
