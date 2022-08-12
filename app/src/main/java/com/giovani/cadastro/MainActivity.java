package com.giovani.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.giovani.cadastro.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    private String nome = "";
    private String telefone = "";
    private String email = "";
    private boolean aceitoLista = false;
    private int sexo = 1;
    private String cidade = "";
    private String uf = "";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }
}