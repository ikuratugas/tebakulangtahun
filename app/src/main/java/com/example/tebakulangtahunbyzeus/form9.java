package com.example.tebakulangtahunbyzeus;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class form9 extends AppCompatActivity {
    private Button mv_iyaF10;
    private Button mv_tdkF10;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form9);

        mv_iyaF10 = findViewById(R.id.tb_iyaF9);
        mv_tdkF10 = findViewById(R.id.tb_tdkF9);

        mv_iyaF10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form10Show = new Intent(form9.this, form10.class);
                Intent get_username = getIntent();

                form10Show.putExtra("total_bl", get_username.getIntExtra("total_bl", 0) + 4);
                form10Show.putExtra("total_tg", get_username.getIntExtra("total_tg",0) + 0);
                form10Show.putExtra("username", get_username.getStringExtra("username"));
                startActivity(form10Show);
                finish();
            }
        });

        mv_tdkF10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form10Show = new Intent(form9.this, form10.class);
                Intent get_username = getIntent();

                form10Show.putExtra("total_bl", get_username.getIntExtra("total_bl", 0) + 0);
                form10Show.putExtra("total_tg", get_username.getIntExtra("total_tg",0) + 0);
                form10Show.putExtra("username", get_username.getStringExtra("username"));
                startActivity(form10Show);
                finish();
            }
        });
    }
}