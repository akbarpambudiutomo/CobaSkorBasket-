package com.example.akbar.appskorbasket;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);

        Intent i = this.getIntent();
        String namaA = i.getStringExtra("namaA");
        String namaB = i.getStringExtra("namaB");

        TextView TnamaA = findViewById(R.id.namaA);
        TextView TnamaB = findViewById(R.id.namaB);

        TnamaA.setText(namaA);
        TnamaB.setText(namaB);

    }

    public void point3A (View v){
        TextView TnilaiA = findViewById(R.id.nilaiA);
        String SnilaiA = TnilaiA.getText().toString();

        Integer InilaiA = Integer.parseInt(SnilaiA);
        int jumlah = InilaiA + 3;

        TnilaiA.setText(String.valueOf(jumlah));
    }

    public void point2A (View v){
        TextView TnilaiA = findViewById(R.id.nilaiA);
        String SnilaiA = TnilaiA.getText().toString();

        Integer InilaiA = Integer.parseInt(SnilaiA);
        int jumlah = InilaiA + 2;

        TnilaiA.setText(String.valueOf(jumlah));
    }

    public void freethrowA (View v){
        TextView TnilaiA = findViewById(R.id.nilaiA);
        String SnilaiA = TnilaiA.getText().toString();

        Integer InilaiA = Integer.parseInt(SnilaiA);
        int jumlah = InilaiA + 1;

        TnilaiA.setText(String.valueOf(jumlah));
    }

    public void point3B (View v){
        TextView TnilaiB = findViewById(R.id.nilaiB);
        String SnilaiB = TnilaiB.getText().toString();

        Integer InilaiB = Integer.parseInt(SnilaiB);
        int jumlah = InilaiB + 3;

        TnilaiB.setText(String.valueOf(jumlah));
    }

    public void point2B (View v){
        TextView TnilaiB = findViewById(R.id.nilaiB);
        String SnilaiB = TnilaiB.getText().toString();

        Integer InilaiB = Integer.parseInt(SnilaiB);
        int jumlah = InilaiB + 2;

        TnilaiB.setText(String.valueOf(jumlah));
    }

    public void freethrowB (View v){
        TextView TnilaiB = findViewById(R.id.nilaiB);
        String SnilaiB = TnilaiB.getText().toString();

        Integer InilaiB = Integer.parseInt(SnilaiB);
        int jumlah = InilaiB + 1;

        TnilaiB.setText(String.valueOf(jumlah));
    }



    public void finish(View v){
        TextView TnilaiA = findViewById(R.id.nilaiA);
        TextView TnilaiB = findViewById(R.id.nilaiB);

        String SnilaiA = TnilaiB.getText().toString();
        String SnilaiB = TnilaiB.getText().toString();

        Integer InilaiA = Integer.parseInt(SnilaiA);
        int jumlah1 = InilaiA = 0;

        Integer InilaiB = Integer.parseInt(SnilaiB);
        int jumlah2 = InilaiB = 0;

        TnilaiA.setText(String.valueOf(jumlah1));
        TnilaiB.setText(String.valueOf(jumlah2));


    }


}
