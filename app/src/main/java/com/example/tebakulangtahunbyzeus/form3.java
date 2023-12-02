package com.example.tebakulangtahunbyzeus;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class form3 extends AppCompatActivity {
    private Button mv_iyaF4;
    private Button mv_tdkF4;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form3);


        mv_iyaF4 = findViewById(R.id.tb_iyaF3);
        mv_tdkF4 = findViewById(R.id.tb_tdkF3);

        mv_iyaF4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form4Show = new Intent(form3.this,form4.class);
                Intent get_username = getIntent();

                form4Show.putExtra("total_tg", get_username.getIntExtra("total_tg",0) + 2);
                form4Show.putExtra("username", get_username.getStringExtra("username"));
                startActivity(form4Show);
                finish();
            }
        });

        mv_tdkF4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form4Show = new Intent(form3.this, form4.class);
                Intent get_username = getIntent();

                form4Show.putExtra("total_tg", get_username.getIntExtra("total_tg",0) + 0);
                form4Show.putExtra("username", get_username.getStringExtra("username"));
                startActivity(form4Show);
                finish();
            }
        });



    }
}