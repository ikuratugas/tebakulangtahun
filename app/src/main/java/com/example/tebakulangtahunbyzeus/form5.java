package com.example.tebakulangtahunbyzeus;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class form5 extends AppCompatActivity {
    private Button mv_iyaF6;
    private Button mv_tdkF6;

    private TextView coba;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form5);

        mv_iyaF6 = findViewById(R.id.tb_iyaF5);
        mv_tdkF6 = findViewById(R.id.tb_tdkF5);

        mv_iyaF6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form6Show = new Intent(form5.this, form6.class);
                Intent get_username = getIntent();

                form6Show.putExtra("total_tg", get_username.getIntExtra("total_tg",0) + 8);
                form6Show.putExtra("username", get_username.getStringExtra("username"));
                startActivity(form6Show);
                finish();
            }
        });

        mv_tdkF6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form6Show = new Intent(form5.this, form6.class);
                Intent get_username = getIntent();

                form6Show.putExtra("total_tg", get_username.getIntExtra("total_tg",0) + 0);
                form6Show.putExtra("username", get_username.getStringExtra("username"));
                startActivity(form6Show);
                finish();
            }
        });
    }
}