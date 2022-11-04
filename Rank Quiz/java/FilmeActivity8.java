package com.example.quizfilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FilmeActivity8 extends AppCompatActivity {

    Button buttonQ8;
    EditText editTextQ8;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme8);

        buttonQ8 = findViewById((R.id.buttonQ8));
        editTextQ8 = findViewById(R.id.editTextQ8);

        buttonQ8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resposta8 = editTextQ8.getText().toString();
                resposta8= resposta8.toLowerCase();

                if (resposta8.equals("norbit")){
                    Toast.makeText(FilmeActivity8.this, "Correto",Toast.LENGTH_SHORT).show();
                    Intent novaTela = new Intent(FilmeActivity8.this, FilmeActivity9.class);
                    startActivity(novaTela);
                }else {
                    Toast.makeText(FilmeActivity8.this, "Incorreto", Toast.LENGTH_SHORT).show();
                    Intent novaTela = new Intent(FilmeActivity8.this, FilmeActivity9.class);
                    startActivity(novaTela);
                }
            }
        });
    }
}