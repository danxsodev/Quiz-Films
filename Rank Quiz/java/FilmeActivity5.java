package com.example.quizfilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FilmeActivity5 extends AppCompatActivity {

    Button buttonQ5;
    EditText editTextQ5;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme5);

        buttonQ5 = findViewById((R.id.buttonQ5));
        editTextQ5 = findViewById(R.id.editTextQ5);

        buttonQ5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resposta5 = editTextQ5.getText().toString();
                resposta5 = resposta5.toLowerCase();

                if (resposta5.equals("cowboy bebop")){
                    Toast.makeText(FilmeActivity5.this, "Correto",Toast.LENGTH_SHORT).show();
                    Intent novaTela = new Intent(FilmeActivity5.this, FilmeActivity6.class);
                    startActivity(novaTela);
                }else {
                    Toast.makeText(FilmeActivity5.this, "Incorreto", Toast.LENGTH_SHORT).show();
                    Intent novaTela = new Intent(FilmeActivity5.this, FilmeActivity6.class);
                    startActivity(novaTela);
                }
            }
        });
    }
}