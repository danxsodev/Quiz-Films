package com.example.quizfilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FilmeActivity9 extends AppCompatActivity {

    Button buttonQ9;
    EditText editTextQ9;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme9);

        buttonQ9 = findViewById((R.id.buttonQ9));
        editTextQ9 = findViewById(R.id.editTextQ9);

        buttonQ9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resposta9 = editTextQ9.getText().toString();
                resposta9= resposta9.toLowerCase();

                if (resposta9.equals("sexta-feira 13")){
                    Toast.makeText(FilmeActivity9.this, "Correto",Toast.LENGTH_SHORT).show();
                    Intent novaTela = new Intent(FilmeActivity9.this, FilmeActivity10.class);
                    startActivity(novaTela);
                }else {
                    Toast.makeText(FilmeActivity9.this, "Incorreto", Toast.LENGTH_SHORT).show();
                    Intent novaTela = new Intent(FilmeActivity9.this, FilmeActivity10.class);
                    startActivity(novaTela);
                }
            }
        });
    }
}