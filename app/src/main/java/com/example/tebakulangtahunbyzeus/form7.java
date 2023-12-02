package com.example.tebakulangtahunbyzeus;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class form7 extends AppCompatActivity {
    private Button mv_iyaF8;
    private Button mv_tdkF8;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form7);

        mv_iyaF8 = findViewById(R.id.tb_iyaF7);
        mv_tdkF8 = findViewById(R.id.tb_tdkF7);

        mv_iyaF8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form8Show = new Intent(form7.this, form8.class);
                Intent get_username = getIntent();

                form8Show.putExtra("total_bl", 1);
                form8Show.putExtra("total_tg", get_username.getIntExtra("total_tg",0) + 0);
                form8Show.putExtra("username", get_username.getStringExtra("username"));
                startActivity(form8Show);
                finish();
            }
        });

        mv_tdkF8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form8Show = new Intent(form7.this, form8.class);
                Intent get_username = getIntent();

                form8Show.putExtra("total_bl", 0);
                form8Show.putExtra("total_tg", get_username.getIntExtra("total_tg",0) + 0);
                form8Show.putExtra("username", get_username.getStringExtra("username"));
                startActivity(form8Show);
                finish();
            }
        });
    }
}