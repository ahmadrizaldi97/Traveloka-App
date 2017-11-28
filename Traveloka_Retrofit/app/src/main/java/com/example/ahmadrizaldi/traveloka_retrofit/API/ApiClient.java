package com.example.ahmadrizaldi.traveloka_retrofit.API;

/**
 * Created by ahmadrizaldi on 11/22/17.
 */

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static final String BASE_URL = "http://192.168.43.181/traveloka/index.php/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() { if (retrofit==null) {
        retrofit = new Retrofit.Builder() .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()) .build();
    }
        return retrofit; }
}