package com.example.quiz_filmes_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Questao2Activity extends AppCompatActivity {

    Button buttonResponderQ2, buttonp2;
    ImageView imageViewQ2;
    EditText editTextTextQ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao2);

        imageViewQ2 = findViewById(R.id.imageViewQ2);
        editTextTextQ2 = findViewById(R.id.editTextTextQ2);
        buttonResponderQ2 = findViewById(R.id.buttonResponderQ2);
        buttonp2 = findViewById(R.id.buttonp2);

        buttonp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent novaTela = new Intent(Questao2Activity.this, Questao3Activity.class);
                startActivity(novaTela);
            }
        });

        buttonResponderQ2. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = editTextTextQ2.getText().toString();
                nome = nome. toLowerCase();



                if (nome.equals("interestelar")){
                    Toast.makeText(Questao2Activity.this,
                            "Acertou", Toast.LENGTH_SHORT).show();
                    Listar lista = new Listar();
                    lista.pontuacao();

                }

                else if(nome.equals("")){
                    Toast.makeText(Questao2Activity.this,
                            "Insira o nome do filme", Toast.LENGTH_SHORT).show();

                }

                else {
                    Toast.makeText(Questao2Activity.this,
                            "Errou", Toast.LENGTH_SHORT).show();

                }
            }

        });
    }
}