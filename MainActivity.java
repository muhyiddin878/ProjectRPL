package com.example.muhyiddin878.gastricdiseasediagnosis;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    ImageButton masuk;
    EditText nama;
    EditText usia;
    Spinner jenis;






    public static  String name;
    public static  String umur;
    public static  String jenis1;
    ProgressDialog loading1;


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        nama=(EditText) findViewById(R.id.nama) ;
        usia =(EditText) findViewById(R.id.usia);
        jenis =(Spinner) findViewById(R.id.spin);
        loading1= new ProgressDialog(this);





        masuk= (ImageButton) findViewById(R.id.button1);
        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name=nama.getText().toString();
                umur=usia.getText().toString();
                jenis1=jenis.getSelectedItem().toString();




                if (!TextUtils.isEmpty(name)){
                    if (!TextUtils.isEmpty(umur)){
                        loading1.setMessage("Silahkan Tunggu....");
                        loading1.setCancelable(false);
                        loading1.show();
                        new Handler().postDelayed(new Runnable(){
                            @Override
                            public void run(){
                                loading1.dismiss();
                                Intent i=new Intent(MainActivity.this, StartActivity.class); //pindah halaman
                                startActivity(i);
                            }

                        },3000);

                    } else{
                        Toast.makeText(MainActivity.this, "Data Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                    }
                } else{
                    Toast.makeText(MainActivity.this, "Data Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }



            }
        });




    }
}
