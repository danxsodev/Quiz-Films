package com.example.quiz_filmes_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Questao3Activity extends AppCompatActivity {
    Button buttonResponderQ3, buttonp3;
    ImageView imageViewQ3;
    EditText editTextTextQ3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao3);
        imageViewQ3 = findViewById(R.id.imageViewQ3);
        editTextTextQ3 = findViewById(R.id.editTextTextQ3);
        buttonResponderQ3 = findViewById(R.id.buttonResponderQ3);
        buttonp3 = findViewById(R.id.buttonp3);


        buttonp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent novaTela = new Intent(Questao3Activity.this, Questao4Activity.class);
                startActivity(novaTela);
            }
        });

        buttonResponderQ3. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String resposta = editTextTextQ3.getText().toString();
                resposta = resposta.toLowerCase();

                String[] nomes = resposta.split(" ");
                for (String nome : nomes) {
                    if (nome.equals("tropa de elite")) {
                        Toast.makeText(Questao3Activity.this,
                                "Acertou", Toast.LENGTH_SHORT).show();
                        Listar lista = new Listar();
                        lista.pontuacao();
                        break;

                    } else if (nome.equals("")) {
                        Toast.makeText(Questao3Activity.this,
                                "Insira o nome do filme", Toast.LENGTH_SHORT).show();
                        break;

                    } else {
                        Toast.makeText(Questao3Activity.this,
                                "Errou", Toast.LENGTH_SHORT).show();
                        break;
                    }
                }

            }

        });
    }
}