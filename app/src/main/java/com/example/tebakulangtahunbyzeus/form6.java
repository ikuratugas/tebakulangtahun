package com.example.tebakulangtahunbyzeus;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class form6 extends AppCompatActivity {
    private Button mv_iyaFormbulan;
    private Button mv_tdkFormbulan;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form6);

        mv_iyaFormbulan = findViewById(R.id.tb_iyaF6);
        mv_tdkFormbulan = findViewById(R.id.tb_tdkF6);

        mv_iyaFormbulan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent formbulanShow = new Intent(form6.this, formbulan.class);
                Intent get_username = getIntent();

                formbulanShow.putExtra("total_tg", get_username.getIntExtra("total_tg",0) + 16);
                formbulanShow.putExtra("username", get_username.getStringExtra("username"));
                startActivity(formbulanShow);
                finish();
            }
        });

        mv_tdkFormbulan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent formbulanShow = new Intent(form6.this, formbulan.class);
                Intent get_username = getIntent();

                formbulanShow.putExtra("total_tg", get_username.getIntExtra("total_tg",0) + 0);
                formbulanShow.putExtra("username", get_username.getStringExtra("username"));
                startActivity(formbulanShow);
                finish();
            }
        });
    }
}