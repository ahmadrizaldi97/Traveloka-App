package com.example.ahmadrizaldi.traveloka_retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity; import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.ahmadrizaldi.traveloka_retrofit.API.ApiClient;
import com.example.ahmadrizaldi.traveloka_retrofit.API.ApiInterface;

import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Button btGet, btUpdate, btInsert, btDelete, showData;
    ApiInterface mApiInterface;
    List<Maskapai> maskapai = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btGet = (Button) findViewById(R.id.btGet);
        btUpdate = (Button) findViewById(R.id.btUpdate);
        btInsert = (Button) findViewById(R.id.btInsert);
        btDelete = (Button) findViewById(R.id.btDelete);
        showData = (Button) findViewById(R.id.showData);

        mApiInterface = ApiClient.getClient().create(ApiInterface.class);

        btGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<GetMaskapai> pembelianCall = mApiInterface.getmaskapai();

                pembelianCall.enqueue(new Callback<GetMaskapai>() {
                    @Override
                    public void onResponse(Call<GetMaskapai> call, Response<GetMaskapai> response) {
                        List<Maskapai> pembelianList = response.body().getListDataPembelian();
                        maskapai = pembelianList;
                        Log.d("Retrofit Get", "Jumlah data Maskapai: " + String.valueOf(pembelianList.size()));
                        System.out.println(pembelianList.get(1).getNama_maskapai());

                    }

                    @Override
                    public void onFailure(Call<GetMaskapai> call, Throwable t) {
                        Log.e("Retrofit Get", t.toString());
                    }
                });

            }
        });

        btUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<CRUDMaskapai> updatePembelianCall = mApiInterface.putmaskapai("5","Garuda");
                updatePembelianCall.enqueue(new Callback<CRUDMaskapai>() {
                    @Override
                    public void onResponse(Call<CRUDMaskapai> call, Response<CRUDMaskapai> response) {
                        Log.d("Retrofit Update", "Status Update: " + String.valueOf(response.body().getStatus()));
                    }

                    @Override
                    public void onFailure(Call<CRUDMaskapai> call, Throwable t) {
                        Log.d("Retrofit Update", t.getMessage());
                    }
                });
            }
        });

        btInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<CRUDMaskapai> postPembelianCall =
                        mApiInterface.postmaskapai("","Sriwijaya Air");

                postPembelianCall.enqueue(new Callback<CRUDMaskapai>() {
                    @Override
                    public void onResponse(Call<CRUDMaskapai> call, Response<CRUDMaskapai> response) {
                        Log.d("Retrofit Insert", "Status Insert: " + String.valueOf(response.body().getStatus()));
                    }

                    @Override
                    public void onFailure(Call<CRUDMaskapai> call, Throwable t) {
                        Log.d("Retrofit Insert", t.getMessage());
                    }
                });

            }
        });


        btDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<CRUDMaskapai> deletePembelian =
                        mApiInterface.deletemaskapai("5");


                deletePembelian.enqueue(new Callback<CRUDMaskapai>() {
                    @Override
                    public void onResponse(Call<CRUDMaskapai> call, Response<CRUDMaskapai> response) {
                        Log.i("Retrofit Delete", "Status Delete: " + String.valueOf(response.body().getStatus()));
                    }

                    @Override
                    public void onFailure(Call<CRUDMaskapai> call, Throwable t) {
                        Log.i("Retrofit Delete", t.getMessage());
                    }
                });
//
            }
        });

        showData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(maskapai.get(1).getNama_maskapai() + "Dari Show Data");
            }
        });



    }
}
