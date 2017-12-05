package com.example.muhyiddin878.gastricdiseasediagnosis;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.IdRes;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;


public class KuisionerActivity extends AppCompatActivity{

    private Context mContext;
    private Activity mActivity;

    private RelativeLayout mRelativeLayout;

    private  ImageButton nButton;

    private PopupWindow mPopupWindow;

    private  ImageButton off;
    private  ImageButton home;
    private  ImageButton tentang;

    ImageView kl;
    ImageButton next;
    ImageButton back;
    ImageButton submit;
    String umur1 = MainActivity.umur;
    String jenis2 = MainActivity.jenis1;
    String nama1 = MainActivity.name;
    public static Soal[] soal;
    ProgressDialog loading2;

    RadioButton YA, TIDAK;
    RadioGroup group;
    int load = 0;
    double jawaban =-1;
    TextView quest;
    int skor;


    public static String hasilakhir;
    public static String posisi;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuisioner);

        quest = (TextView) findViewById(R.id.soal);
        group = (RadioGroup) findViewById(R.id.choice);
        next= (ImageButton) findViewById(R.id.tombolnext);

        soal = StartActivity.soal;
        kl = (ImageView) findViewById(R.id.ganti);
        back =(ImageButton) findViewById(R.id.tombolback);
        submit = (ImageButton) findViewById(R.id.tombolnext);

        TextView nama2 = (TextView) findViewById(R.id.tampilnama);
        nama2.setText(nama1);

        TextView umur2 = (TextView) findViewById(R.id.tampilusia);
        umur2.setText(umur1 +" Th");

        loading2= new ProgressDialog(this);

        if (jenis2.equals("Perempuan")) {
            kl.setImageResource(R.drawable.girl);
        } else {
            kl.setImageResource(R.drawable.boy);
        }


        prepare();

        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i) {
                    case R.id.pilihan1:
                        jawaban = 1;
                        break;
                    case R.id.pilihan2:
                        jawaban = 0;
                        break;

                    case R.id.pilihan3:
                        jawaban =  0.4;
                        break;

                    case R.id.pilihan4:
                        jawaban =  0.6;
                        break;

                    case R.id.pilihan5:
                        jawaban =  0.8;
                        break;

                }
            }

        });





        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                if (load < StartActivity.soal.length ){
                    if (jawaban==-1){
                        Toast.makeText(getApplicationContext(), "Kamu belum memilih jawaban", Toast.LENGTH_SHORT).show();
                    }
                    else if(jawaban==1){
                        skor+=1;
                        if (load < soal.length-1){
                            soal[load].setJawaban(jawaban);
                            load++;
                            setSoal(load);
                            group.clearCheck();
                            Toast.makeText(KuisionerActivity.this, jawaban + String.valueOf(load), Toast.LENGTH_SHORT).show();
                            jawaban=-1;


                        }
                        else{
                            soal[load].setJawaban(jawaban);
                            load++;

                        }

                    }
                    else if(jawaban==0.4){
                        skor+=1;
                        if (load < soal.length-1){
                            soal[load].setJawaban(jawaban);
                            load++;
                            setSoal(load);
                            group.clearCheck();
                            Toast.makeText(KuisionerActivity.this, jawaban + String.valueOf(load), Toast.LENGTH_SHORT).show();

                            jawaban=-1;

                        }
                        else{
                            soal[load].setJawaban(jawaban);
                            load++;

                        }

                    }
                    else if(jawaban==0.6){
                        skor+=1;
                        if (load < soal.length-1){
                            soal[load].setJawaban(jawaban);
                            load++;
                            setSoal(load);
                            group.clearCheck();
                            //Toast.makeText(KuisionerActivity.this, jawaban+ String.valueOf(load), Toast.LENGTH_SHORT).show();
                            jawaban=-1;

                        }
                        else{
                            soal[load].setJawaban(jawaban);
                            load++;

                        }

                    }
                    else if(jawaban==0.8){
                        skor+=1;
                        if (load < soal.length-1){
                            soal[load].setJawaban(jawaban);
                            load++;
                            setSoal(load);
                            group.clearCheck();
                            //Toast.makeText(KuisionerActivity.this, jawaban + String.valueOf(load), Toast.LENGTH_SHORT).show();
                            jawaban=-1;

                        }
                        else{
                            soal[load].setJawaban(jawaban);
                            load++;

                        }

                    }


                    else if(jawaban==0){
                        if (load < soal.length-1){
                            soal[load].setJawaban(jawaban);
                            load++;
                            setSoal(load);
                            group.clearCheck();
                            jawaban=-1;

                        }
                        else{
                            soal[load].setJawaban(jawaban);
                            load++;
                        }
                    }
                }
                else {
                    submit.setImageResource(R.drawable.tombolsubmit);


                    next.setId(R.id.tombolsubmit);

//                    for (int i = 0; i < soal.length; i++) {
//                        Toast.makeText(KuisionerActivity.this, String.valueOf(soal[i].getJawaban())+" "+(i+1), Toast.LENGTH_SHORT).show();
//                    }

                    submit.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(v.getId()==R.id.tombolsubmit){
                                AlertDialog.Builder builder= new AlertDialog.Builder(KuisionerActivity.this);
                                builder.setMessage("Apakah Anda Yakin Akan Submit?")
                                        .setCancelable(true)
                                        .setPositiveButton("YA", new OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                diagnosapenyakit ok = new diagnosapenyakit();


                                                if(ok.maag()==0 && ok.dispepsia()==0 && ok.gerd()==0){
                                                    hasilakhir="ANDA TIDAK MENGALAMI GANGGUAN LAMBUNG";

                                                }


                                                else if(ok.maag() >= ok.dispepsia() && ok.maag() >= ok.gerd() ){
                                                    hasilakhir= "MAAG";
                                                    posisi= posisi= String.valueOf((new DecimalFormat("##.##").format(ok.maag())));

                                                }
                                                else if (ok.dispepsia() >= ok.maag() && ok.dispepsia() >= ok.gerd()){
                                                    hasilakhir="DISPEPSIA";
                                                    posisi= String.valueOf((new DecimalFormat("##.##").format(ok.dispepsia())));

                                                } else if (ok.gerd() >= ok.maag() && ok.gerd() >= ok.dispepsia()){
                                                    hasilakhir="GERD";
                                                    posisi= posisi= String.valueOf((new DecimalFormat("##.##").format(ok.gerd())));
                                                }

                                                loading2.setMessage("Silahkan Tunggu....");
                                                loading2.setCancelable(false);
                                                loading2.show();
                                                new Handler().postDelayed(new Runnable(){
                                                    @Override
                                                    public void run(){
                                                        loading2.dismiss();
                                                        Intent i=new Intent(KuisionerActivity.this, Halaman_hasil.class); //pindah halaman
                                                        startActivity(i);
                                                    }

                                                },3000);

                                            }
                                        })
                                        .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                dialog.cancel();
                                            }
                                        });
                                AlertDialog alert=builder.create();
                                alert.show();

                            }


                        }
                    });

                }

            }
        });


        // Get the application context
        mContext = getApplicationContext();

        // Get the activity
        mActivity = KuisionerActivity.this;

        // Get the widgets reference from XML layout
        mRelativeLayout = (RelativeLayout) findViewById(R.id.rl);
        nButton = (ImageButton) findViewById(R.id.tombolsetting);


        // Set a click listener for the text view
        nButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Initialize a new instance of LayoutInflater service
                LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);


                // Inflate the custom layout/view
                View customView = inflater.inflate(R.layout.custom_layout_setting,null);
                home =(ImageButton) customView.findViewById(R.id.tombolhome);
                off = (ImageButton) customView.findViewById(R.id.tomboloff);
                tentang= (ImageButton) customView.findViewById(R.id.tomboltentang);
                off.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        AlertDialog.Builder builder= new AlertDialog.Builder(KuisionerActivity.this);
                        builder.setMessage("Apakah Anda Yakin Akan Keluar?")
                                .setCancelable(true)
                                .setPositiveButton("YA", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                       moveTaskToBack(true);
                                        System.exit(1);

                                    }
                                })
                                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alert=builder.create();
                        alert.show();
                    }
                });

                home.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(KuisionerActivity.this, MainActivity.class); //pindah halaman
                        startActivity(i);
                    }
                });

                tentang.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder builder= new AlertDialog.Builder(KuisionerActivity.this);
                        builder.setMessage("Gastric Disease Diagnose V.1.0.0 by Muhyiddin Ubaidillah")
                                .setCancelable(true)
                                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();

                                    }
                                });

                        AlertDialog alert=builder.create();
                        alert.show();
                    }
                });



                // Initialize a new instance of popup window
                mPopupWindow = new PopupWindow(
                        customView,
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                );

                // Set an elevation value for popup window
                // Call requires API level 21
                if(Build.VERSION.SDK_INT>=24){
                    mPopupWindow.setElevation(5.0f);
                }

                // Get a reference for the custom view close button
                ImageButton closeButton = (ImageButton) customView.findViewById(R.id.ib_close);

                // Set a click listener for the popup window close button
                closeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Dismiss the popup window
                        mPopupWindow.dismiss();
                    }
                });


                // Finally, show the popup window at the center location of root relative layout
                mPopupWindow.showAtLocation(mRelativeLayout, Gravity.CENTER,0,0);
            }
        });








        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                next.setId(R.id.tombolnext);
                next= (ImageButton) findViewById(R.id.tombolnext);

                if (load<=0){
                    Intent i=new Intent(KuisionerActivity.this, StartActivity.class); //pindah halaman
                    startActivity(i);
                }
                else {
                    setSoal(--load);

                }

            }
        });

    }

    void prepare(){
        quest.setText(soal[0].getSoal());
    }

    void setSoal(int load){
        quest.setText(soal[load].getSoal());

    }

}





