package com.example.tebakulangtahunbyzeus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class form2 extends AppCompatActivity {
//    private TextView coba;
    private Button mv_iyaF3;
    private Button mv_tdkF3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form2);
//        Intent intent = getIntent();
//        coba = findViewById(R.id.nama);
//        coba.setText(intent.getStringExtra("username"));
        mv_iyaF3 = findViewById(R.id.tb_iyaF2);
        mv_tdkF3 = findViewById(R.id.tb_tdkF2);

        mv_iyaF3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form3Show = new Intent(form2.this, form3.class);
                Intent get_username = getIntent();

                form3Show.putExtra("total_tg", 1);
                form3Show.putExtra("username", get_username.getStringExtra("username"));
                startActivity(form3Show);
                finish();
            }
        });

        mv_tdkF3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form3Show = new Intent(form2.this, form3.class);
                Intent get_username = getIntent();

                form3Show.putExtra("total_tg", 0);
                form3Show.putExtra("username", get_username.getStringExtra("username"));
                startActivity(form3Show);
                finish();
            }
        });


    }
}