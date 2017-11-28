package com.example.ahmadrizaldi.traveloka_retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ahmadrizaldi.traveloka_retrofit.API.ApiClient;
import com.example.ahmadrizaldi.traveloka_retrofit.API.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TambahMaskapai extends AppCompatActivity {

    Button btGet, btUpdate, btInsert, btDelete, showData, TambahMaskapai;
    EditText namaMaskapai;
    ApiInterface mApiInterface;
    List<Maskapai> maskapai = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_maskapai);

        TambahMaskapai = (Button)findViewById(R.id.btn_tambahmaskapai);
        namaMaskapai = (EditText)findViewById(R.id.edt_namaMaskapai);

        mApiInterface = ApiClient.getClient().create(ApiInterface.class);

        TambahMaskapai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<CRUDMaskapai> postPembelianCall =
                        mApiInterface.postmaskapai("",namaMaskapai.getText().toString().trim());

                postPembelianCall.enqueue(new Callback<CRUDMaskapai>() {
                    @Override
                    public void onResponse(Call<CRUDMaskapai> call, Response<CRUDMaskapai> response) {
                        pesansukses();
                        Log.d("Retrofit Insert", "Status Insert: " + String.valueOf(response.body().getStatus()));
                    }

                    @Override
                    public void onFailure(Call<CRUDMaskapai> call, Throwable t) {
                        Log.d("Retrofit Insert", t.getMessage());
                    }
                });
            }
        });
    }

    private void pesansukses(){
        Toast.makeText(this, "Insert Sukses",Toast.LENGTH_SHORT).show();
    }
}
