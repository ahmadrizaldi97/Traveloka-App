package com.example.ahmadrizaldi.traveloka_retrofit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.ahmadrizaldi.traveloka_retrofit.API.APIUser;
import com.example.ahmadrizaldi.traveloka_retrofit.API.ApiClient;
import com.example.ahmadrizaldi.traveloka_retrofit.API.ApiInterface;
import com.example.ahmadrizaldi.traveloka_retrofit.Adapter.AdapterUser;
import com.example.ahmadrizaldi.traveloka_retrofit.Adapter.RegisterUser;
import com.example.ahmadrizaldi.traveloka_retrofit.Get.GetUser;
import com.example.ahmadrizaldi.traveloka_retrofit.Model.User;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class User_ extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<User> listUser = new ArrayList<>();
    AdapterUser mAdapter;

    Button btn_register2;

    APIUser mApiInterface;
    List<User> userlis = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        recyclerView = (RecyclerView)findViewById(R.id.recy_user);
        btn_register2 = (Button)findViewById(R.id.btn_register2);
        mApiInterface = ApiClient.getClient().create(APIUser.class);

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new AdapterUser(User_.this, listUser);
        recyclerView.setAdapter(mAdapter);

        final Call<GetUser> pembelianCall = mApiInterface.getmaskapai();

        btn_register2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(User_.this, RegisterUser.class);
                startActivity(i);
            }
        });

        pembelianCall.enqueue(new Callback<GetUser>() {
            @Override
            public void onResponse(Call<GetUser> call, Response<GetUser> response) {
                List<User> pembelianList = response.body().getListDataPembelian();
                userlis = pembelianList;
                System.out.println(userlis.size());


                for (int i=0; i< userlis.size(); i++){
                    tambahData(userlis.get(i).getId_user(), userlis.get(i).getEmail(), userlis.get(i).getPassowrd());
                }


            }

            @Override
            public void onFailure(Call<GetUser> call, Throwable t) {

            }
        });


    }

    private void tambahData(String id, String email, String passowrd){
        User u = new User(id, email, passowrd);
        listUser.add(u);
        mAdapter.notifyDataSetChanged();

    }
}
