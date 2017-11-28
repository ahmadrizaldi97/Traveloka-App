package com.example.ahmadrizaldi.traveloka_retrofit.API;

import com.example.ahmadrizaldi.traveloka_retrofit.CRUDMaskapai;
import com.example.ahmadrizaldi.traveloka_retrofit.CRUDUser.CRUDUser;
import com.example.ahmadrizaldi.traveloka_retrofit.Get.GetUser;
import com.example.ahmadrizaldi.traveloka_retrofit.GetMaskapai;

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

public interface APIUser { @GET("user/index")
Call<GetUser> getmaskapai();
    @FormUrlEncoded
    @POST("user/index")
    Call<CRUDUser> postmaskapai(@Field("email") String email,

                                @Field("password") String password);
    @FormUrlEncoded
    @PUT("user/index")
    Call<CRUDUser>
    putmaskapai(@Field("id_user") String idmaskapai,

                @Field("email") String email,
                @Field("password") String password);
    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "user/index", hasBody = true)
    Call<CRUDUser> deletemaskapai(@Field("id_user") String id_user);
}
