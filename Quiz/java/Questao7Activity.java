package com.example.quiz_filmes_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Questao7Activity extends AppCompatActivity {
    Button buttonResponderQ7, buttonp7;
    ImageView imageViewQ7;
    EditText editTextTextQ7;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao7);

        imageViewQ7 = findViewById(R.id.imageViewQ7);
        editTextTextQ7 = findViewById(R.id.editTextTextQ7);
        buttonResponderQ7 = findViewById(R.id.buttonResponderQ7);
        buttonp7 = findViewById(R.id.buttonp7);


        buttonp7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent novaTela = new Intent(Questao7Activity.this, Questao9Activity.class);
                startActivity(novaTela);
            }
        });

        buttonResponderQ7. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resposta = editTextTextQ7.getText().toString();
                resposta = resposta. toLowerCase();

                String[] nomes = resposta.split(" ");
                for(String nome: nomes) {
                    if (nome.equals("piratas do caribe")){
                        Toast.makeText(Questao7Activity.this,
                                "Acertou", Toast.LENGTH_SHORT).show();
                        Listar lista = new Listar();
                        lista.pontuacao();
                        break;

                    }

                    else if(nome.equals("")){
                        Toast.makeText(Questao7Activity.this,
                                "Insira o nome do filme", Toast.LENGTH_SHORT).show();

                    }


                    else {
                        Toast.makeText(Questao7Activity.this,
                                "Errou", Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
            }

        });


    }
}