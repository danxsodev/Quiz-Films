package com.example.quiz_filmes_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Questao5Activity extends AppCompatActivity {
    Button buttonResponderQ5, buttonp5;
    ImageView imageViewQ5;
    EditText editTextTextQ5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao5);

        imageViewQ5 = findViewById(R.id.imageViewQ5);
        editTextTextQ5 = findViewById(R.id.editTextTextQ5);
        buttonResponderQ5 = findViewById(R.id.buttonResponderQ5);
        buttonp5 = findViewById(R.id.buttonp5);


        buttonp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent novaTela = new Intent(Questao5Activity.this, Questao6Activity.class);
                startActivity(novaTela);
            }
        });

        buttonResponderQ5. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = editTextTextQ5.getText().toString();
                nome = nome. toLowerCase();

                if (nome.equals("7 prisioneiros")){
                    Toast.makeText(Questao5Activity.this,
                            "Acertou", Toast.LENGTH_SHORT).show();
                    Listar lista = new Listar();
                    lista.pontuacao();


                }
                else if(nome.equals("")){
                    Toast.makeText(Questao5Activity.this,
                            "Insira o nome do filme", Toast.LENGTH_SHORT).show();

                }

                else {
                    Toast.makeText(Questao5Activity.this,
                            "Errou", Toast.LENGTH_SHORT).show();

                }
            }

        });

    }
}