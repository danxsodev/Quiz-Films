package com.example.quizfilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonQ1;
    EditText editTextQ1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonQ1 =findViewById(R.id.buttonQ1);
        editTextQ1 = findViewById(R.id.editTextQ1);

        buttonQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resposta1 = editTextQ1.getText().toString();
                resposta1 = resposta1.toLowerCase();

                if (resposta1.equals("carros 2")){
                    Toast.makeText(MainActivity.this, "Correto",Toast.LENGTH_SHORT).show();
                    Intent novaTela = new Intent(MainActivity.this, FilmeActivity2.class);
                    startActivity(novaTela);
                }else {
                    Toast.makeText(MainActivity.this, "Incorreto", Toast.LENGTH_SHORT).show();
                    Intent novaTela = new Intent(MainActivity.this, FilmeActivity2.class);
                    startActivity(novaTela);

                }
            }
        });
    }
}