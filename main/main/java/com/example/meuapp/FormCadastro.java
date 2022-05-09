package com.example.meuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FormCadastro extends AppCompatActivity {

    private Button bt_cadastrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);

        getSupportActionBar().hide();
        IniciarComponentes();

        bt_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(FormCadastro.this, TelaPrincipal.class);
                startActivity(intent);
            }
        });

    }

    private void IniciarComponentes(){
        bt_cadastrar = findViewById(R.id.bt_cadastrar);
    }
}