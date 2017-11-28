package com.example.muhyiddin878.gastricdiseasediagnosis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class after_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);


        String nama1 = MainActivity.name;
        String umur1 = MainActivity.umur;
        String jenis2 = MainActivity.jenis1;



        TextView nama2 = (TextView) findViewById(R.id.tampilnama);
        nama2.setText(nama1);

        TextView umur2 = (TextView) findViewById(R.id.tampilusia);
        umur2.setText(umur1);

        TextView jenis3 = (TextView) findViewById(R.id.tampilkelamin);
        jenis3.setText(jenis2);



    }
}
