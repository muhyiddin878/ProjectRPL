package com.example.muhyiddin878.gastricdiseasediagnosis;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;


public class Halaman_hasil extends AppCompatActivity {



    ImageView kl;
    ImageButton exit;
    ImageButton rincian;
    ImageButton setting;
    String umur1 = MainActivity.umur;
    String jenis2 = MainActivity.jenis1;
    String nama1 = MainActivity.name;
    String tampilan= KuisionerActivity.hasilakhir;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_hasil2);


        kl = (ImageView) findViewById(R.id.ganti);


        TextView nama2 = (TextView) findViewById(R.id.tampilnama);
        nama2.setText(nama1);

        TextView umur2 = (TextView) findViewById(R.id.tampilusia);
        umur2.setText(umur1 +" Th");

        TextView tampilan2= (TextView) findViewById(R.id.hasil);

        rincian= (ImageButton) findViewById(R.id.tombolrincian);






        if (tampilan.equals("MAAG")){
            tampilan2.setText("MAAG");

        }
        else if(tampilan.equals("DISPEPSIA")){
            tampilan2.setText("DISPEPSIA");
        }
        else if(tampilan.equals("ANDA TIDAK MENGALAMI GANGGUAN LAMBUNG")){
            tampilan2.setText("ANDA TIDAK MENGALAMI GANGGUAN LAMBUNG");
            rincian.setVisibility(View.GONE);
        }
        else{
            tampilan2.setText("GERD");
        }



        if (jenis2.equals("Perempuan")){
            kl.setImageResource(R.drawable.girl);
        } else {
            kl.setImageResource(R.drawable.boy);
        }




        rincian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tampilan.equals("MAAG")){
                    Intent i=new Intent(Halaman_hasil.this, MaagActivity.class); //pindah halaman
                    startActivity(i);

                }
                else if(tampilan.equals("DISPEPSIA")){
                    Intent i=new Intent(Halaman_hasil.this, DispepsiaActivity.class); //pindah halaman
                    startActivity(i);
                }

                else{
                    Intent i=new Intent(Halaman_hasil.this, GerdActivity.class); //pindah halaman
                    startActivity(i);
                }

            }
        });

    }
}