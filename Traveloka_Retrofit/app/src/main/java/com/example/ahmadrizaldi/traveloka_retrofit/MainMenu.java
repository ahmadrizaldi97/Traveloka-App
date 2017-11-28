package com.example.ahmadrizaldi.traveloka_retrofit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ahmadrizaldi.traveloka_retrofit.Adapter.RegisterUser;

public class MainMenu extends AppCompatActivity {

    Button user, maskapai, datapenerbangan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        user = (Button)findViewById(R.id.btn_user);
        maskapai = (Button)findViewById(R.id.btn_maskapai);
        datapenerbangan = (Button)findViewById(R.id.btn_DataPenerbangan);


        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainMenu.this, User_.class);
                startActivity(i);
            }
        });

        maskapai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainMenu.this, MaskapaiActivity.class);
                startActivity(i);
            }
        });

        datapenerbangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainMenu.this, InsertDataPenerbangan.class);
                startActivity(i);
            }
        });
    }
}
