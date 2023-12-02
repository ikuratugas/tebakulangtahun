package com.example.tebakulangtahunbyzeus;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class formbulan extends AppCompatActivity {
    private Button mv_F7;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formbulan);

        mv_F7 = findViewById(R.id.tb_formbulan);

        mv_F7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form7Show = new Intent(formbulan.this, form7.class);
                Intent get_username = getIntent();

                form7Show.putExtra("total_tg", get_username.getIntExtra("total_tg",0) + 0);
                form7Show.putExtra("username", get_username.getStringExtra("username"));
                startActivity(form7Show);
                finish();
            }
        });
    }
}