package com.example.quizfilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FilmeActivity6 extends AppCompatActivity {

    Button buttonQ6;
    EditText editTextQ6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme6);

        buttonQ6 = findViewById((R.id.buttonQ6));
        editTextQ6 = findViewById(R.id.editTextQ6);

        buttonQ6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resposta6 = editTextQ6.getText().toString();
                resposta6 = resposta6.toLowerCase();

                if (resposta6.equals("clube da luta")){
                    Toast.makeText(FilmeActivity6.this, "Correto",Toast.LENGTH_SHORT).show();
                    Intent novaTela = new Intent(FilmeActivity6.this, FilmeActivity7.class);
                    startActivity(novaTela);
                }else {
                    Toast.makeText(FilmeActivity6.this, "Incorreto", Toast.LENGTH_SHORT).show();
                    Intent novaTela = new Intent(FilmeActivity6.this, FilmeActivity7.class);
                    startActivity(novaTela);
                }
            }
        });
    }
}