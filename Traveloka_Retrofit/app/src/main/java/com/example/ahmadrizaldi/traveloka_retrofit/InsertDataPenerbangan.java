package com.example.ahmadrizaldi.traveloka_retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ahmadrizaldi.traveloka_retrofit.API.APIDataPenerbangan;
import com.example.ahmadrizaldi.traveloka_retrofit.API.ApiClient;
import com.example.ahmadrizaldi.traveloka_retrofit.API.ApiInterface;
import com.example.ahmadrizaldi.traveloka_retrofit.CRUDUser.CRUDDataPenerbangan;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InsertDataPenerbangan extends AppCompatActivity {

    EditText flight_id, darimana, kemana, harga;
    Button tambahDataPenerbangan;
    APIDataPenerbangan mApiInterface;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_data_penerbangan);

        flight_id = (EditText)findViewById(R.id.edt_flightid);
        darimana = (EditText)findViewById(R.id.edt_darimana);
        kemana = (EditText)findViewById(R.id.edt_kemana);
        harga = (EditText)findViewById(R.id.edt_harga);

        mApiInterface = ApiClient.getClient().create(APIDataPenerbangan.class);

        tambahDataPenerbangan = (Button)findViewById(R.id.btn_tambahpenerbangan);

        tambahDataPenerbangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Call<CRUDDataPenerbangan> postPembelianCall =
                        mApiInterface.postmaskapai(flight_id.getText().toString().trim(),darimana.getText().toString().trim(), kemana.getText().toString().trim(), harga.getText().toString().trim(), "1");


                postPembelianCall.enqueue(new Callback<CRUDDataPenerbangan>() {
                    @Override
                    public void onResponse(Call<CRUDDataPenerbangan> call, Response<CRUDDataPenerbangan> response) {
                        pesansukses();
                    }

                    @Override
                    public void onFailure(Call<CRUDDataPenerbangan> call, Throwable t) {

                    }
                });


            }
        });

    }

    private void pesansukses(){
        Toast.makeText(this, "Insert Sukses",Toast.LENGTH_SHORT).show();
    }
}
