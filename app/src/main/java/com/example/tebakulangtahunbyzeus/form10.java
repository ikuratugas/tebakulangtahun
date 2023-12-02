package com.example.tebakulangtahunbyzeus;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class form10 extends AppCompatActivity {
    private Button mv_iyaformhasil;
    private Button mv_tdkformhasil;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form10);

        mv_iyaformhasil = findViewById(R.id.tb_iyaF10);
        mv_tdkformhasil = findViewById(R.id.tb_tdkF10);

        mv_iyaformhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent formhasilShow = new Intent(form10.this, formHasil.class);
                Intent get_username = getIntent();

                formhasilShow.putExtra("total_bl", get_username.getIntExtra("total_bl", 0) + 8);
                formhasilShow.putExtra("total_tg", get_username.getIntExtra("total_tg",0) + 0);
                formhasilShow.putExtra("username", get_username.getStringExtra("username"));
                startActivity(formhasilShow);
                finish();
            }
        });

        mv_tdkformhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent formhasilShow = new Intent(form10.this, formHasil.class);
                Intent get_username = getIntent();

                formhasilShow.putExtra("total_bl", get_username.getIntExtra("total_bl", 0) + 0);
                formhasilShow.putExtra("total_tg", get_username.getIntExtra("total_tg",0) + 0);
                formhasilShow.putExtra("username", get_username.getStringExtra("username"));
                startActivity(formhasilShow);
                finish();
            }
        });
    }
}