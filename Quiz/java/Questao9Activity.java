package com.example.quiz_filmes_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Questao9Activity extends AppCompatActivity {
    Button buttonResponderQ9, buttonp9;
    ImageView imageViewQ9;
    EditText editTextTextQ9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao9);

        imageViewQ9 = findViewById(R.id.imageViewQ9);
        editTextTextQ9 = findViewById(R.id.editTextTextQ9);
        buttonResponderQ9 = findViewById(R.id.buttonResponderQ9);
        buttonp9 = findViewById(R.id.buttonp9);


        buttonp9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent novaTela = new Intent(Questao9Activity.this,
                        Questao10Activity.class);
                startActivity(novaTela);
            }
        });

        buttonResponderQ9. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = editTextTextQ9.getText().toString();
                nome = nome. toLowerCase();



                if (nome.equals("princesa e o sapo")){
                    Toast.makeText(Questao9Activity.this,
                            "Acertou", Toast.LENGTH_SHORT).show();
                    Listar lista = new Listar();
                    lista.pontuacao();



                }
                else if(nome.equals("")){
                    Toast.makeText(Questao9Activity.this,
                            "Insira o nome do filme", Toast.LENGTH_SHORT).show();

                }

                else {
                    Toast.makeText(Questao9Activity.this,
                            "Errou", Toast.LENGTH_SHORT).show();



                }
            }


        });
    }
}