package com.example.quiz_filmes_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Questao4Activity extends AppCompatActivity {
    Button buttonResponderQ4, buttonp4;
    ImageView imageViewQ4;
    EditText editTextTextQ4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao4);
        imageViewQ4 = findViewById(R.id.imageViewQ4);
        editTextTextQ4 = findViewById(R.id.editTextTextQ4);
        buttonResponderQ4 = findViewById(R.id.buttonResponderQ4);
        buttonp4 = findViewById(R.id.buttonp4);



        buttonp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent novaTela = new Intent(Questao4Activity.this, Questao5Activity.class);
                startActivity(novaTela);
            }
        });

        buttonResponderQ4. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resposta = editTextTextQ4.getText().toString();
                resposta = resposta. toLowerCase();

                String[] nomes = resposta.split(" ");
                for(String nome: nomes) {
                    if (nome.equals("shrek")){
                        Toast.makeText(Questao4Activity.this,
                                "Acertou", Toast.LENGTH_SHORT).show();
                        Listar lista = new Listar();
                        lista.pontuacao();
                        break;

                    }

                    else if(nome.equals("")){
                        Toast.makeText(Questao4Activity.this,
                                "Insira o nome do filme", Toast.LENGTH_SHORT).show();
                                break;
                    }
                    else {
                        Toast.makeText(Questao4Activity.this,
                                "Errou", Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
            }

        });
    }
}