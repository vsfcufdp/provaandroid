package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edtValor;
    private EditText edtLucroLiquido;
    private EditText edtPatrimonioLiquido;
    private EditText edtNumAcoes;
    private EditText edtPrecoAtual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValor = findViewById(R.id.edtAtivo);
        edtLucroLiquido = findViewById(R.id.edtLucroLiquido);
        edtPatrimonioLiquido = findViewById(R.id.edtPatrimonioLiquido);
        edtNumAcoes = findViewById(R.id.edtNumAcoes);
        edtPrecoAtual = findViewById(R.id.edtPrecoAtual);

    }
    public void onClickCalcular(View view){

        double lucroLiquido = Double.parseDouble(edtLucroLiquido.getText().toString());
        double patrimonioLiquido= Double.parseDouble(edtPatrimonioLiquido.getText().toString());
        long numAcoes = Long.parseLong(edtLucroLiquido.getText().toString());
        double precoAtual = Double.parseDouble(edtPrecoAtual.getText().toString());

        double lpa = lucroLiquido / numAcoes;
        double pl = precoAtual / lpa;
        double roe = (lucroLiquido/patrimonioLiquido) * 100;
        double vpa = patrimonioLiquido / numAcoes;
        double pvp = lpa / vpa;
        Intent intent = new Intent(this, Resultados.class);
        Bundle b = new Bundle();

        b.putDouble("lpa", lpa);
        b.putDouble("pl", pl);
        b.putDouble("roe", roe);
        b.putDouble("vpa", vpa);
        b.putDouble("pvp", pvp);

        intent.putExtras(b);
        startActivity(intent);
    }
}