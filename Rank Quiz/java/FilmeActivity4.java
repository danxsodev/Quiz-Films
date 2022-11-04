package com.example.quizfilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FilmeActivity4 extends AppCompatActivity {

    Button buttonQ4;
    EditText editTextQ4;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme4);

       buttonQ4 = findViewById((R.id.buttonQ4));
        editTextQ4 = findViewById(R.id.editTextQ4);

        buttonQ4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resposta4 = editTextQ4.getText().toString();
                resposta4 = resposta4.toLowerCase();

                if (resposta4.equals("se eu fosse você")){
                    Toast.makeText(FilmeActivity4.this, "Correto",Toast.LENGTH_SHORT).show();
                    Intent novaTela = new Intent(FilmeActivity4.this, FilmeActivity5.class);
                    startActivity(novaTela);
                }else {
                    Toast.makeText(FilmeActivity4.this, "Incorreto", Toast.LENGTH_SHORT).show();
                    Intent novaTela = new Intent(FilmeActivity4.this, FilmeActivity5.class);
                    startActivity(novaTela);

                }
            }
        });
    }
}