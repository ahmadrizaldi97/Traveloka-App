package com.example.ahmadrizaldi.traveloka_retrofit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ahmadrizaldi on 11/22/17.
 */

public class GetMaskapai {

    @SerializedName("status")
    String status;
    @SerializedName("result")
    List<Maskapai> listDataPembelian;
    @SerializedName("message")
    String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Maskapai> getListDataPembelian() {
        return listDataPembelian;
    }

    public void setListDataPembelian(List<Maskapai> listDataPembelian) {
        this.listDataPembelian = listDataPembelian;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
