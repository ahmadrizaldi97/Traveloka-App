package com.example.ahmadrizaldi.traveloka_retrofit.CRUDUser;

import com.example.ahmadrizaldi.traveloka_retrofit.Model.DataPenerbangan;
import com.example.ahmadrizaldi.traveloka_retrofit.Model.User;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ahmadrizaldi on 11/28/17.
 */

public class CRUDDataPenerbangan {

    @SerializedName("status")
    String status;
    @SerializedName("result")
    DataPenerbangan mPembelian;
    @SerializedName("message")
    String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DataPenerbangan getmPembelian() {
        return mPembelian;
    }

    public void setmPembelian(DataPenerbangan mPembelian) {
        this.mPembelian = mPembelian;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
