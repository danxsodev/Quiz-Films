package com.example.quizfilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FilmeActivity2 extends AppCompatActivity {

    Button buttonQ2;
    EditText editTextQ2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme2);

        buttonQ2 = findViewById(R.id.buttonQ2);
        editTextQ2 = findViewById(R.id.editTextQ2);

        buttonQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resposta2 = editTextQ2.getText().toString();
                resposta2 = resposta2.toLowerCase();

                if (resposta2.equals("telefone preto")){
                    Toast.makeText(FilmeActivity2.this, "Correto",Toast.LENGTH_SHORT).show();
                    Intent novaTela = new Intent(FilmeActivity2.this, FilmeActivity3.class);
                    startActivity(novaTela);
                }else {
                    Toast.makeText(FilmeActivity2.this, "Incorreto", Toast.LENGTH_SHORT).show();
                    Intent novaTela = new Intent(FilmeActivity2.this, FilmeActivity3.class);
                    startActivity(novaTela);

                }
            }
        });
    }
}