package com.example.quizlucas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIniciar = findViewById( R.id.btnIniciar);

    }

    public void Iniciar (View view){

        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);

    }



}