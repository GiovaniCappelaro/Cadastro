package com.giovani.cadastro;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.giovani.cadastro.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    /*private String nome = "";
    private String telefone = "";
    private String email = "";
    private boolean aceitoLista = false;
    private int sexo = 1;
    private String cidade = "";
    private String uf = ""; */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(activityMainBinding.getRoot());

        Spinner spinner = findViewById(activityMainBinding.spinnerUF.getId());

        spinner.setAdapter(new ArrayAdapter<UFs>(
                this, android.R.layout.simple_spinner_item, UFs.values()));

        activityMainBinding.buttonSalvar.setOnClickListener( view -> {
            String nome = activityMainBinding.nomeCompletoText.getText().toString();
            String telefone = activityMainBinding.telefoneText.getText().toString();
            String email = activityMainBinding.emailText.getText().toString();
            boolean aceitoLista = activityMainBinding.checkboxAceitoLista.isChecked();
            String sexo = activityMainBinding.sexoRadioButtonMasculino.isChecked() ? "Masculino" : "Feminino";
            String cidade = activityMainBinding.cidade.getText().toString();
            String uf = activityMainBinding.spinnerUF.getSelectedItem().toString();

            Formulario formulario = new Formulario(nome, telefone, email, aceitoLista, sexo, cidade, uf); //chamar classe formulario e iniciar objeto com constr

            Toast.makeText(this, formulario.toString(), Toast.LENGTH_LONG).show(); //equivale ao "console.log()"
        } );



        //setContentView(R.layout.activity_main);
    }
}