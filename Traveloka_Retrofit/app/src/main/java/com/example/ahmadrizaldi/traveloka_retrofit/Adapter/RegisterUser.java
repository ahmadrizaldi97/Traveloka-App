package com.example.ahmadrizaldi.traveloka_retrofit.Adapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ahmadrizaldi.traveloka_retrofit.API.APIUser;
import com.example.ahmadrizaldi.traveloka_retrofit.API.ApiClient;
import com.example.ahmadrizaldi.traveloka_retrofit.API.ApiInterface;
import com.example.ahmadrizaldi.traveloka_retrofit.CRUDMaskapai;
import com.example.ahmadrizaldi.traveloka_retrofit.CRUDUser.CRUDUser;
import com.example.ahmadrizaldi.traveloka_retrofit.R;
import com.example.ahmadrizaldi.traveloka_retrofit.User_;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterUser extends AppCompatActivity {

    Button register;
    EditText email, password;
    APIUser mApiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);


        mApiInterface = ApiClient.getClient().create(APIUser.class);

        email =(EditText)findViewById(R.id.edt_email);
        password = (EditText)findViewById(R.id.edt_passowrd);

        register = (Button)findViewById(R.id.btn_register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<CRUDUser> postPembelianCall =
                        mApiInterface.postmaskapai(email.getText().toString().trim(),password.getText().toString().trim());

                postPembelianCall.enqueue(new Callback<CRUDUser>() {
                    @Override
                    public void onResponse(Call<CRUDUser> call, Response<CRUDUser> response) {
                        pesansukses();
                        Intent i = new Intent(RegisterUser.this, User_.class);
                        startActivity(i);
                    }

                    @Override
                    public void onFailure(Call<CRUDUser> call, Throwable t) {

                    }
                });

            }
        });

    }

    private void pesansukses(){
        Toast.makeText(this, "Insert Sukses",Toast.LENGTH_SHORT).show();
    }
}
