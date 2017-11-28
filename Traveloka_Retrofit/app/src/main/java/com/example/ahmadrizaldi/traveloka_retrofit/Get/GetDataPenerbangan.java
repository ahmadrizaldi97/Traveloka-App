package com.example.ahmadrizaldi.traveloka_retrofit.Get;

import com.example.ahmadrizaldi.traveloka_retrofit.Model.DataPenerbangan;
import com.example.ahmadrizaldi.traveloka_retrofit.Model.User;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ahmadrizaldi on 11/28/17.
 */

public class GetDataPenerbangan {

    @SerializedName("status")
    String status;
    @SerializedName("result")
    List<DataPenerbangan> listDataPembelian;
    @SerializedName("message")
    String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<DataPenerbangan> getListDataPembelian() {
        return listDataPembelian;
    }

    public void setListDataPembelian(List<DataPenerbangan> listDataPembelian) {
        this.listDataPembelian = listDataPembelian;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
