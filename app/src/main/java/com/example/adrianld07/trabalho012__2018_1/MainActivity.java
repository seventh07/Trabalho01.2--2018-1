package com.example.adrianld07.trabalho012__2018_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularSalario() {
        Float valorPeso = Float.parseFloat(etHorasTrab.getText().toString());
        Float valorAltura = Float.parseFloat(etFaltas.getText().toString());
        Float valorAltura = Float.parseFloat(etFilhos.getText().toString());
        Float valorAltura = Float.parseFloat(spCargo.getText().toString());
        Float imc;


    }
