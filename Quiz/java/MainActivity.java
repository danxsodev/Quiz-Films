package com.example.quiz_filmes_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonResponderQ1, buttonp1;
    ImageView imageViewQ1;
    EditText  editTextTextQ1;
    TextView textViewPonto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       imageViewQ1 = findViewById(R.id.imageViewQ1);
       editTextTextQ1 = findViewById(R.id.editTextTextQ1);
       buttonResponderQ1 = findViewById(R.id.buttonResponderQ1);
        buttonp1 = findViewById(R.id.buttonp1);


        buttonp1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent novaTela = new Intent(MainActivity.this, Questao2Activity.class);
               startActivity(novaTela);
           }
       });

       buttonResponderQ1. setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                   String nome = editTextTextQ1.getText().toString();
                   nome = nome. toLowerCase();

                       if (nome.equals("vingadores ultimato")){
                           Toast.makeText(MainActivity.this,
                                   "Acertou", Toast.LENGTH_SHORT).show();
                           Listar lista = new Listar();
                           lista.pontuacao();

                       }

                       else if(nome.equals("")){
                           Toast.makeText(MainActivity.this,
                                   "Insira o nome do filme", Toast.LENGTH_SHORT).show();

                       }

                       else {
                          Toast.makeText(MainActivity.this,
                                  "Errou", Toast.LENGTH_SHORT).show();

                       }
                   }


       });

    }
}