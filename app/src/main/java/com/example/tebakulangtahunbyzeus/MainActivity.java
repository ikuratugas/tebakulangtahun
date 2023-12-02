package com.example.tebakulangtahunbyzeus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button mvF2;
    private EditText in_nama;
    public String username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        in_nama = findViewById(R.id.input_nama);
        mvF2 = findViewById(R.id.mvF2);

        mvF2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form2Show = new Intent(MainActivity.this, form2.class);
                username = in_nama.getText().toString().trim();
                form2Show.putExtra("username", username);

                startActivity(form2Show);
                finish();
            }
        });
    }
}