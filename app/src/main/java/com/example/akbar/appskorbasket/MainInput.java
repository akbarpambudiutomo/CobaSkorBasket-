package com.example.akbar.appskorbasket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainInput extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_input);
    }

    public void panggil_nama(View v){
        EditText EnamaA = findViewById(R.id.input_a);
        EditText EnamaB = findViewById(R.id.input_b);

        String S_namaA = EnamaA.getText().toString();
        String S_namaB = EnamaB.getText().toString();

        Intent kirim = new Intent(this,MainUtama.class);
        kirim.putExtra("namaA", S_namaA);
        kirim.putExtra("namaB", S_namaB);
        startActivity(kirim);
    }

}
