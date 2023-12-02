package com.example.tebakulangtahunbyzeus;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class form8 extends AppCompatActivity {
    private Button mv_iyaF9;
    private Button mv_tdkF9;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form8);

        mv_iyaF9 = findViewById(R.id.tb_iyaF8);
        mv_tdkF9 = findViewById(R.id.tb_tdkF8);

        mv_iyaF9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form9Show = new Intent(form8.this, form9.class);
                Intent get_username = getIntent();

                form9Show.putExtra("total_bl", get_username.getIntExtra("total_bl", 0) + 2);
                form9Show.putExtra("total_tg", get_username.getIntExtra("total_tg",0) + 0);
                form9Show.putExtra("username", get_username.getStringExtra("username"));
                startActivity(form9Show);
                finish();
            }
        });

        mv_tdkF9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form9Show = new Intent(form8.this, form9.class);
                Intent get_username = getIntent();

                form9Show.putExtra("total_bl", get_username.getIntExtra("total_bl", 0) + 0);
                form9Show.putExtra("total_tg", get_username.getIntExtra("total_tg",0) + 0);
                form9Show.putExtra("username", get_username.getStringExtra("username"));
                startActivity(form9Show);
                finish();
            }
        });
    }
}