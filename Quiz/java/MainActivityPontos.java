package com.example.quiz_filmes_a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityPontos extends AppCompatActivity {
     TextView textViewPontos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pontos);
        textViewPontos = findViewById(R.id.textViewPontos);

    }
}