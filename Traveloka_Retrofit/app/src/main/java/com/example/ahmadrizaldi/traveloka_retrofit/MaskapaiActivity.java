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
import com.example.ahmadrizaldi.traveloka_retrofit.Adapter.AdapterMaskapai;
import com.example.ahmadrizaldi.traveloka_retrofit.Model.User;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MaskapaiActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Maskapai> listMaskapai = new ArrayList<>();
    AdapterMaskapai mAdapter;

    Button tambahmaskapai;

    ApiInterface mApiInterface;
    List<Maskapai> userlis = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maskapai);

        tambahmaskapai = (Button)findViewById(R.id.btn_tambahmaskapai2);
        recyclerView = (RecyclerView)findViewById(R.id.recy_maskapai);
        recyclerView.setHasFixedSize(true);

        mApiInterface = ApiClient.getClient().create(ApiInterface.class);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new AdapterMaskapai(MaskapaiActivity.this, listMaskapai);
        recyclerView.setAdapter(mAdapter);

        Call<GetMaskapai> pembelianCall = mApiInterface.getmaskapai();

        tambahmaskapai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MaskapaiActivity.this, TambahMaskapai.class);
                startActivity(i);
            }
        });

        pembelianCall.enqueue(new Callback<GetMaskapai>() {
            @Override
            public void onResponse(Call<GetMaskapai> call, Response<GetMaskapai> response) {
                List<Maskapai> pembelianList = response.body().getListDataPembelian();
                userlis = pembelianList;
                System.out.println(userlis.size());


                for (int i=0; i< userlis.size(); i++){
                    TambahData(userlis.get(i).getId_maskapai(), userlis.get(i).getNama_maskapai());
                }
            }

            @Override
            public void onFailure(Call<GetMaskapai> call, Throwable t) {

            }
        });

    }

    private void TambahData(String id,String nama){
        Maskapai a = new Maskapai(id, nama);
        listMaskapai.add(a);
        mAdapter.notifyDataSetChanged();
    }
}
