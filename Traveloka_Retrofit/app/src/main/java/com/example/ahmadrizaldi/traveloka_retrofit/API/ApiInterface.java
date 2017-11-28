package com.example.ahmadrizaldi.traveloka_retrofit.API;

/**
 * Created by ahmadrizaldi on 11/22/17.
 */

import com.example.ahmadrizaldi.traveloka_retrofit.CRUDMaskapai;
import com.example.ahmadrizaldi.traveloka_retrofit.GetMaskapai;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded; import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;


public interface ApiInterface { @GET("maskapai/index") Call<GetMaskapai> getmaskapai();
    @FormUrlEncoded
    @POST("maskapai/index")
    Call<CRUDMaskapai> postmaskapai(@Field("id_maskapai") String idmaskapai,

                                    @Field("nama_maskapai") String nama_maskapai);
    @FormUrlEncoded
    @PUT("maskapai/index")
    Call<CRUDMaskapai>
    putmaskapai(@Field("id_maskapai") String idmaskapai,


                @Field("nama_maskapai") String nama_maskapai);
    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "maskapai/index", hasBody = true)
    Call<CRUDMaskapai> deletemaskapai(@Field("id_maskapai") String idmaskapai);
}
