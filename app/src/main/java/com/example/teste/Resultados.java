package com.example.teste;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Resultados extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_resultados);
        TextView tvLpa = findViewById(R.id.tvLpa);
        TextView tvPl = findViewById(R.id.tvPl);
        TextView tvRoe = findViewById(R.id.tvRoe);
        TextView tvVpa = findViewById(R.id.tvVpa);
        TextView tvPvp = findViewById(R.id.tvPvp);


        Bundle params = getIntent().getExtras();
        double lpa = params.getDouble("lpa");
        double pl = params.getDouble("pl");
        double roe = params.getDouble("roe");
        double vpa = params.getDouble("vpa");
        double pvp = params.getDouble("pvp");


        tvLpa.setText("R$" + String.valueOf(lpa));
        tvPl.setText("R$" + String.valueOf(pl));
        tvRoe.setText("R$" + String.valueOf(roe));
        tvVpa.setText("R$" + String.valueOf(vpa));
        tvPvp.setText("R$" + String.valueOf(pvp));
    }


}