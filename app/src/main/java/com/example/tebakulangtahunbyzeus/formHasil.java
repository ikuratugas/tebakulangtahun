package com.example.tebakulangtahunbyzeus;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class formHasil extends AppCompatActivity {
    private TextView nama;
    private TextView hasil_tanggal;
    private TextView hasil_bulan;
    private Button tampil;
    private int tampung_bulan;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_hasil);



        tampil = findViewById(R.id.tb_tampil);

        Intent tampilkan = getIntent();
        hasil_tanggal = findViewById(R.id.hasil_tg);
        hasil_bulan = findViewById(R.id.hasil_bl);

        tampung_bulan = tampilkan.getIntExtra("total_bl", 0);
        if (tampung_bulan == 1){
            hasil_bulan.setText("JANUARI");
        } else if (tampung_bulan == 2){
            hasil_bulan.setText("FEBRUARI");
        } else if (tampung_bulan == 3){
            hasil_bulan.setText("MARET");
        } else if (tampung_bulan == 4){
            hasil_bulan.setText("APRIL");
        } else if (tampung_bulan == 5){
            hasil_bulan.setText("MEI");
        } else if (tampung_bulan == 6){
            hasil_bulan.setText("JUNI");
        } else if (tampung_bulan == 7){
            hasil_bulan.setText("JULI");
        } else if (tampung_bulan == 8){
            hasil_bulan.setText("AGUSTUS");
        } else if (tampung_bulan == 9){
            hasil_bulan.setText("SEPTEMBER");
        } else if (tampung_bulan == 10){
            hasil_bulan.setText("OKTOBER");
        } else if (tampung_bulan == 11){
            hasil_bulan.setText("NOVEMBER");
        } else if (tampung_bulan == 12){
            hasil_bulan.setText("DESEMBER");
        }
        hasil_tanggal.setText(String.valueOf(tampilkan.getIntExtra("total_tg", 0)) + " ");





        tampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = findViewById(R.id.nama);
                Intent coba = getIntent();
                nama.setText(" ulang tahunmu to " + coba.getStringExtra("username"));

                hasil_tanggal.setVisibility(View.VISIBLE);
                hasil_bulan.setVisibility(View.VISIBLE);
                tampil.setVisibility(View.INVISIBLE);
            }
        });
    }
}