package com.example.ahmadrizaldi.traveloka_retrofit.Model;

/**
 * Created by ahmadrizaldi on 11/28/17.
 */
import com.google.gson.annotations.SerializedName;

public class DataPenerbangan {


    @SerializedName("id_flights")
    private String id_flights;
    @SerializedName("darimana")
    private String darimana;
    @SerializedName("kemana")
    private String kemana;
    @SerializedName("harga")
    private String harga;
    @SerializedName("id_maskapai")
    private String id_maskapai;

    public DataPenerbangan() {
    }

    public DataPenerbangan(String id_flights, String darimana, String kemana, String harga, String id_maskapai) {
        this.id_flights = id_flights;
        this.darimana = darimana;
        this.kemana = kemana;
        this.harga = harga;
        this.id_maskapai = id_maskapai;
    }

    public String getId_flights() {
        return id_flights;
    }

    public void setId_flights(String id_flights) {
        this.id_flights = id_flights;
    }

    public String getDarimana() {
        return darimana;
    }

    public void setDarimana(String darimana) {
        this.darimana = darimana;
    }

    public String getKemana() {
        return kemana;
    }

    public void setKemana(String kemana) {
        this.kemana = kemana;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getId_maskapai() {
        return id_maskapai;
    }

    public void setId_maskapai(String id_maskapai) {
        this.id_maskapai = id_maskapai;
    }
}
