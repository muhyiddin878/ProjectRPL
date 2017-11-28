package com.example.muhyiddin878.gastricdiseasediagnosis;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;


public class StartActivity extends AppCompatActivity {


    ImageView kl;
    ImageButton next;
    String umur1 = MainActivity.umur;
    String jenis2 = MainActivity.jenis1;
    String nama1 = MainActivity.name;
    public static Soal [] soal;
    ProgressDialog loading1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_start);

        kl = (ImageView) findViewById(R.id.ganti);

        TextView nama2 = (TextView) findViewById(R.id.tampilnama);
        nama2.setText(nama1);

        TextView umur2 = (TextView) findViewById(R.id.tampilusia);
        umur2.setText(umur1 +" Th");

        if (jenis2.equals("Perempuan")){
            kl.setImageResource(R.drawable.girl);
        } else {
            kl.setImageResource(R.drawable.boy);
        }

        loading1= new ProgressDialog(this);

        next= (ImageButton) findViewById(R.id.tombolstart);

        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {



                soal = new Soal[15];

                soal[0] = new Soal();
                soal[0].setSoal("Apakah Perut anda kembung ?");
                soal[0].setIdsoal(1);

                soal[1] = new Soal();
                soal[1].setSoal("Apakah anda Mengalami sakit pada ulu hati ?");
                soal[1].setIdsoal(2);

                soal[2] = new Soal();
                soal[2].setSoal("Apakah anda Sering merasa lapar ?");
                soal[2].setIdsoal(3);

                soal[3] = new Soal();
                soal[3].setSoal("Apakah anda merasa Mual dan muntah ?");
                soal[3].setIdsoal(4);


                soal[4] = new Soal();
                soal[4].setSoal("Apakah anda merasa nyeri di belakang tulang  dada?");
                soal[4].setIdsoal(5);

                soal[5] = new Soal();
                soal[5].setSoal("Apakah anda sering sendawa?");
                soal[5].setIdsoal(6);

                soal[6] = new Soal();
                soal[6].setSoal("Apakah anda Rasa sakit/tidak nyaman pada perut bagian atas ?");
                soal[6].setIdsoal(7);

                soal[7] = new Soal();
                soal[7].setSoal("Apakah anda merasa Perasaan panas di dada dan perut ?");
                soal[7].setIdsoal(8);

                soal[8] = new Soal();
                soal[8].setSoal("Apakah anda Mengeluarkan gas asam dari mulut ?");
                soal[8].setIdsoal(9);

                soal[9] = new Soal();
                soal[9].setSoal("Apakah anda merasa Rasa tidak nyaman waktu menelan ?");
                soal[0].setIdsoal(10);


                soal[10] = new Soal();
                soal[10].setSoal("Apakah anda merasa sakit waktu menelan?");
                soal[10].setIdsoal(11);

                soal[11] = new Soal();
                soal[11].setSoal("Apakah anda merasa nyeri di dada?");
                soal[11].setIdsoal(12);

                soal[12] = new Soal();
                soal[12].setSoal("Apakah anda mengalami Gangguan pencernaan?");
                soal[12].setIdsoal(13);

                soal[13] = new Soal();
                soal[13].setSoal("Apakah anda Batuk?");
                soal[13].setIdsoal(14);

                soal[14] = new Soal();
                soal[14].setSoal("Apakah anda merasa panas didada ?");
                soal[14].setIdsoal(15);

        loading1.setMessage("Silahkan Tunggu....");
                loading1.setCancelable(false);
                loading1.show();
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                loading1.dismiss();
                Intent i=new Intent(StartActivity.this, KuisionerActivity.class); //pindah halaman
                startActivity(i);
            }

        },3000);


            }
        });



    }
    public void mulaiAnimasiFadein(View view){
        ImageView imageView=(ImageView)
                findViewById(R.id.tombolstart);
        Animation startAnimation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadein);
        imageView.startAnimation(startAnimation);

    }


}
