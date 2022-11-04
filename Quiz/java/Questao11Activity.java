package com.example.quiz_filmes_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Questao11Activity extends AppCompatActivity {
    Button buttonResponderQ11,buttonp11;
    ImageView imageViewQ11;
    EditText editTextTextQ11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao11);

        imageViewQ11 = findViewById(R.id.imageViewQ11);
        editTextTextQ11 = findViewById(R.id.editTextTextQ11);
        buttonResponderQ11 = findViewById(R.id.buttonResponderQ11);



        buttonResponderQ11. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = editTextTextQ11.getText().toString();
                nome = nome. toLowerCase();



                if (nome.equals("cidade de deus")){
                    Toast.makeText(Questao11Activity.this,
                            "Acertou", Toast.LENGTH_SHORT).show();
                    Listar lista = new Listar();
                    int result = lista.pontuacao();
                    Toast.makeText(Questao11Activity.this,
                            "Quantidade de questões acertadas: " + result + "", Toast.LENGTH_SHORT).show();


                }
                else if(nome.equals("")){
                    Toast.makeText(Questao11Activity.this,
                            "Insira o nome do filme", Toast.LENGTH_SHORT).show();

                }

                else {
                    Toast.makeText(Questao11Activity.this,
                            "Errou", Toast.LENGTH_SHORT).show();
                    Listar lista = new Listar();
                    int result = lista.pontuacao() - 1;
                    Toast.makeText(Questao11Activity.this,
                            "Quantidade de questões acertadas: " + result + "", Toast.LENGTH_SHORT).show();

                }

            }

        });
    }
}