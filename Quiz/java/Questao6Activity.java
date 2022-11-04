package com.example.quiz_filmes_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Questao6Activity extends AppCompatActivity {
    Button buttonResponderQ6,buttonp6;
    ImageView imageViewQ6;
    EditText editTextTextQ6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao6);

        imageViewQ6 = findViewById(R.id.imageViewQ6);
        editTextTextQ6 = findViewById(R.id.editTextTextQ6);
        buttonResponderQ6 = findViewById(R.id.buttonResponderQ6);
        buttonp6 = findViewById(R.id.buttonp6);


        buttonp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent novaTela = new Intent(Questao6Activity.this, Questao7Activity.class);
                startActivity(novaTela);
            }
        });

        buttonResponderQ6. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resposta = editTextTextQ6.getText().toString();
                resposta = resposta. toLowerCase();

                String[] nomes = resposta.split(" ");
                for(String nome: nomes) {
                    if (nome.equals("arremessando alto")){
                        Toast.makeText(Questao6Activity.this,
                                "Acertou", Toast.LENGTH_SHORT).show();
                        Listar lista = new Listar();
                        lista.pontuacao();
                        break;

                    }
                    else if(nome.equals("")){
                        Toast.makeText(Questao6Activity.this,
                                "Insira o nome do filme", Toast.LENGTH_SHORT).show();
                        break;
                    }

                    else {
                        Toast.makeText(Questao6Activity.this,
                                "Errou", Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
            }

        });
    }
}