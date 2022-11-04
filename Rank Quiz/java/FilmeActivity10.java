package com.example.quizfilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FilmeActivity10 extends AppCompatActivity {

    Button buttonQ10;
    EditText editTextQ10;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme10);

        buttonQ10 = findViewById((R.id.buttonQ10));
        editTextQ10 = findViewById(R.id.editTextQ10);

        buttonQ10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resposta10 = editTextQ10.getText().toString();
                resposta10= resposta10.toLowerCase();

                if (resposta10.equals("annabelle")){
                    Toast.makeText(FilmeActivity10.this, "Correto",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(FilmeActivity10.this, "Incorreto", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}