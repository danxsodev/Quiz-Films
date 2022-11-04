package com.example.quiz_filmes_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Questao10Activity extends AppCompatActivity {
    Button buttonResponderQ10, buttonp10;
    ImageView imageViewQ10;
    EditText editTextTextQ10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao10);

        imageViewQ10 = findViewById(R.id.imageViewQ10);
        editTextTextQ10 = findViewById(R.id.editTextTextQ10);
        buttonResponderQ10 = findViewById(R.id.buttonResponderQ10);
        buttonp10 = findViewById(R.id.buttonp10);

        buttonp10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent novaTela = new Intent(Questao10Activity.this, Questao11Activity.class);
                startActivity(novaTela);
            }
        });

        buttonResponderQ10. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = editTextTextQ10.getText().toString();
                nome = nome. toLowerCase();



                if (nome.equals("obsessao secreta")){
                    Toast.makeText(Questao10Activity.this,
                            "Acertou", Toast.LENGTH_SHORT).show();
                    Listar lista = new Listar();
                    lista.pontuacao();


                }
                else if(nome.equals("")){
                    Toast.makeText(Questao10Activity.this,
                            "Insira o nome do filme", Toast.LENGTH_SHORT).show();

                }

                else {
                    Toast.makeText(Questao10Activity.this,
                            "Errou", Toast.LENGTH_SHORT).show();

                }

            }

        });

    }
}