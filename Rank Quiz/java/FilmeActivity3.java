package com.example.quizfilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FilmeActivity3 extends AppCompatActivity {

    Button buttonQ3;
    EditText editTextQ3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme3);

        buttonQ3 = findViewById(R.id.buttonQ3);
        editTextQ3 = findViewById(R.id.editTextQ3);

        buttonQ3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resposta3 = editTextQ3.getText().toString();
                resposta3 = resposta3.toLowerCase();

                if (resposta3.equals("tá dando onda")){
                    Toast.makeText(FilmeActivity3.this, "Correto",Toast.LENGTH_SHORT).show();
                    Intent novaTela = new Intent(FilmeActivity3.this, FilmeActivity4.class);
                    startActivity(novaTela);
                }else {
                    Toast.makeText(FilmeActivity3.this, "Incorreto", Toast.LENGTH_SHORT).show();
                    Intent novaTela = new Intent(FilmeActivity3.this, FilmeActivity4.class);
                    startActivity(novaTela);
                }
            }
        });
    }
}