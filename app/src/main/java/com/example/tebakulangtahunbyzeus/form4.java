package com.example.tebakulangtahunbyzeus;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class form4 extends AppCompatActivity {
    private Button mv_iyaF5;
    private Button mv_tdkF5;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form4);

        mv_iyaF5 = findViewById(R.id.tb_iyaF4);
        mv_tdkF5 = findViewById(R.id.tb_tdkF4);

        mv_iyaF5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form5Show = new Intent(form4.this, form5.class);
                Intent get_username = getIntent();

                form5Show.putExtra("total_tg", get_username.getIntExtra("total_tg",0) + 4);
                form5Show.putExtra("username", get_username.getStringExtra("username"));
                startActivity(form5Show);
                finish();
            }
        });

        mv_tdkF5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form5Show = new Intent(form4.this, form5.class);
                Intent get_username = getIntent();


                form5Show.putExtra("total_tg", get_username.getIntExtra("total_tg",0) + 0);
                form5Show.putExtra("username", get_username.getStringExtra("username"));
                startActivity(form5Show);
                finish();
            }
        });

    }

}