package com.example.quizlucas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

        TextView tvResultado, tvCongrats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        tvResultado = findViewById( R.id.tvResultado);
        tvCongrats = findViewById( R.id.tvCongrats);


        Bundle dados = getIntent().getExtras();
        Questao pontosResposta = (Questao) dados.getSerializable("objet");
        String maxAcertos = new String("5");


        tvResultado.setText("VC ACERTOU: " + pontosResposta.getResposta() + " DE UM TOTAL DE 5 QUESTÕES");

        if (String.valueOf(pontosResposta.getResposta()).equals(maxAcertos)){

            tvResultado.setTextColor(Color.GREEN);
            tvCongrats.setTextColor(Color.GREEN);
            tvCongrats.setText("PARABÉNS!!! VC É O MAIS NOVO MILIONÁRIO!");
        }else{

            tvResultado.setTextColor(Color.RED);
            tvCongrats.setTextColor(Color.RED);
            tvCongrats.setText("Q PENA!!! NÃO FOI DESSA VEZ!");
        }









    }
}