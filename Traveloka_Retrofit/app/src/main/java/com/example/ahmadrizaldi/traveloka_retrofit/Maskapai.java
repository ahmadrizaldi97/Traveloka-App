package com.example.ahmadrizaldi.traveloka_retrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ahmadrizaldi on 11/22/17.
 */

public class Maskapai {

    @SerializedName("id_maskapai")
    private String id_maskapai;
    @SerializedName("nama_maskapai")
    private String nama_maskapai;

    public Maskapai() {
    }

    public Maskapai(String id_maskapai, String nama_maskapai) {
        this.id_maskapai = id_maskapai;
        this.nama_maskapai = nama_maskapai;
    }

    public String getId_maskapai() {
        return id_maskapai;
    }

    public void setId_maskapai(String id_maskapai) {
        this.id_maskapai = id_maskapai;
    }

    public String getNama_maskapai() {
        return nama_maskapai;
    }

    public void setNama_maskapai(String nama_maskapai) {
        this.nama_maskapai = nama_maskapai;
    }
}
