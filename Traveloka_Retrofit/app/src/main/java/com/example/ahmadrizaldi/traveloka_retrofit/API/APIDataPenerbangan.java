package com.example.ahmadrizaldi.traveloka_retrofit.API;

import com.example.ahmadrizaldi.traveloka_retrofit.CRUDUser.CRUDDataPenerbangan;
import com.example.ahmadrizaldi.traveloka_retrofit.CRUDUser.CRUDUser;
import com.example.ahmadrizaldi.traveloka_retrofit.Get.GetDataPenerbangan;
import com.example.ahmadrizaldi.traveloka_retrofit.Get.GetUser;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;

/**
 * Created by ahmadrizaldi on 11/28/17.
 */

public interface APIDataPenerbangan { @GET("datapernerbangan/index")
Call<GetDataPenerbangan> getmaskapai();
    @FormUrlEncoded
    @POST("datapernerbangan/index")
    Call<CRUDDataPenerbangan> postmaskapai(@Field("id_flights") String id_flights,
                                           @Field("darimana") String darimana,
                                           @Field("kemana") String kemana,
                                           @Field("harga") String harga,

                                           @Field("id_maskapai") String id_maskapai);
    @FormUrlEncoded
    @PUT("datapernerbangan/index")
    Call<CRUDDataPenerbangan>
    putmaskapai(@Field("id_flights") String id_flights,
                @Field("darimana") String darimana,
                @Field("kemana") String kemana,
                @Field("harga") String harga,

                @Field("id_maskapai") String id_maskapai);
    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "datapernerbangan/index", hasBody = true)
    Call<CRUDDataPenerbangan> deletemaskapai(@Field("id_flights") String id_flights);
}
