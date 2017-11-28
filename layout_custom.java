package com.example.muhyiddin878.gastricdiseasediagnosis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class layout_custom extends AppCompatActivity {

    String tangkap= KuisionerActivity.hasilakhir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_layout_rician_maag);

        TextView rincian2=(TextView) findViewById(R.id.show);
        rincian2.setText(tangkap);












    }
}
