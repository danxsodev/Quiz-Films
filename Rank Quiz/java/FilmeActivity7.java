package com.example.quizfilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FilmeActivity7 extends AppCompatActivity {

    Button buttonQ7;
    EditText editTextQ7;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme7);

        buttonQ7 = findViewById((R.id.buttonQ7));
        editTextQ7 = findViewById(R.id.editTextQ7);

        buttonQ7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resposta7 = editTextQ7.getText().toString();
                resposta7 = resposta7.toLowerCase();

                if (resposta7.equals("sniper americano")){
                    Toast.makeText(FilmeActivity7.this, "Correto",Toast.LENGTH_SHORT).show();
                    Intent novaTela = new Intent(FilmeActivity7.this, FilmeActivity8.class);
                    startActivity(novaTela);
                }else {
                    Toast.makeText(FilmeActivity7.this, "Incorreto", Toast.LENGTH_SHORT).show();
                    Intent novaTela = new Intent(FilmeActivity7.this, FilmeActivity8.class);
                    startActivity(novaTela);
                }
            }
        });
    }
}