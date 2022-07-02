package com.example.quizlucas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    private ProgressBar pb1;
    private TextView tv_Q1, tvIndice;
    private RadioButton rb1, rb2, rb3, rb4;
    private RadioGroup rg;
    private Button btPQ1, btVerificar1;
    private int pergunta = 1;
    private int pontuacao = 0;
    private String [] alternativas = {"", "", "",""};
    Questao questao = new Questao("");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        pb1 = findViewById( R.id.pb1);  tv_Q1 = findViewById( R.id.tv_Q1);
        tvIndice = findViewById(R.id.tvIndice); rb1 = findViewById( R.id.rb1);
        rb2 = findViewById( R.id.rb2); rb3 = findViewById( R.id.rb3);
        rb4 = findViewById( R.id.rb4); rg = findViewById( R.id.rg);
        btPQ1 = findViewById( R.id.btPQ1); btVerificar1 = findViewById( R.id.btVerificar1);

        alternativas = new String[]{"Alicate", "Martelo", "Serrote", "Lixadeira"};
        questao.setEnunciado("1 - Qual destas ferramentas é mais apropriada para cravar pregos em uma superfície?");
        tv_Q1.setText(questao.getEnunciado());
        btPQ1.setEnabled(false);
        pb1.setProgress(20);
        tvIndice.setText("Questão 1/5");
        rb_set_text();

    }
    public void proxQuestao (View view){

        switch (pergunta){

            case 2:
                pb1.setProgress(40);
                tvIndice.setText("Questão 2/5");
                alternativas = new String[]{"Carne", "Abobrinha", "Lentilha", "Ervilha"};
                questao.setEnunciado("2 - Na alimentação vegetariana, qual desses alimentos não é consumido?");
                tv_Q1.setText(questao.getEnunciado());
                btn_questoes();
                rb_set_text();
                rb_change_color();
                break;

            case 3:
                pb1.setProgress(60);
                tvIndice.setText("Questão 3/5");
                alternativas = new String[]{"Sapato", "Cueca", "Chinelo", "Tenis"};
                questao.setEnunciado("3 - Qual destas opções não é um tipo de calçado?");
                tv_Q1.setText(questao.getEnunciado());
                btn_questoes();
                rb_set_text();
                rb_change_color();
                break;

            case 4:
                tvIndice.setText("Questão 4/5");
                pb1.setProgress(80);
                alternativas = new String[]{"2", "3", "4", "6"};
                questao.setEnunciado("4 - Um ano é composto de quantos trimestres?");
                tv_Q1.setText(questao.getEnunciado());
                btn_questoes();
                rb_set_text();
                rb_change_color();
                break;

            case 5:
                tvIndice.setText("Questão 5/5");
                pb1.setProgress(100);
                alternativas = new String[]{"Violino", "Harpa", "Saxofone", "Guitarra"};
                questao.setEnunciado("5 - Qual destes instrumentos musicais não possui cordas?");
                tv_Q1.setText(questao.getEnunciado());
                btn_questoes();
                rb_set_text();
                rb_change_color();
                break;

            case 6:

                Intent intent = new Intent(this, Resultado.class);
                Questao pontosResposta = new Questao(pontuacao);
                intent.putExtra("objet", pontosResposta);
                startActivity(intent);

        }
    }

    public void verificar (View View){

        switch (pergunta){

            case 1:
            case 3:
                if (rb2.isChecked()){
                    rb2.setTextColor(Color.GREEN);
                    rb1.setTextColor(Color.RED);
                    rb3.setTextColor(Color.RED);
                    rb4.setTextColor(Color.RED);
                    Toast.makeText(getApplicationContext(), "RESPOSTA CORRETA!", Toast.LENGTH_LONG).show();
                    pontuacao++;
                    pergunta++;
                    btn_verificar();
                    break;

                }else{
                    rb2.setTextColor(Color.GREEN);
                    rb1.setTextColor(Color.RED);
                    rb3.setTextColor(Color.RED);
                    rb4.setTextColor(Color.RED);
                    Toast.makeText(getApplicationContext(), "RESPOSTA ERRADA!", Toast.LENGTH_LONG).show();
                    pergunta = pergunta + 1;
                    btn_verificar();
                    break;
                }
            case 2:
                if (rb1.isChecked()){

                    rb1.setTextColor(Color.GREEN);
                    rb2.setTextColor(Color.RED);
                    rb3.setTextColor(Color.RED);
                    rb4.setTextColor(Color.RED);
                    Toast.makeText(getApplicationContext(), "RESPOSTA CORRETA!", Toast.LENGTH_LONG).show();
                    pergunta++;
                    pontuacao++;
                    btn_verificar();
                    break;

                }else{
                    rb1.setTextColor(Color.GREEN);
                    rb2.setTextColor(Color.RED);
                    rb3.setTextColor(Color.RED);
                    rb4.setTextColor(Color.RED);
                    Toast.makeText(getApplicationContext(), "RESPOSTA ERRADA!", Toast.LENGTH_LONG).show();
                    pergunta++;
                    btn_verificar();
                    break;
                }
            case 4: if (rb3.isChecked()){

                rb3.setTextColor(Color.GREEN);
                rb2.setTextColor(Color.RED);
                rb1.setTextColor(Color.RED);
                rb4.setTextColor(Color.RED);
                Toast.makeText(getApplicationContext(), "RESPOSTA CORRETA!", Toast.LENGTH_LONG).show();
                pergunta++;
                pontuacao++;
                btn_verificar();
                break;
            }else {

                rb3.setTextColor(Color.GREEN);
                rb2.setTextColor(Color.RED);
                rb1.setTextColor(Color.RED);
                rb4.setTextColor(Color.RED);
                Toast.makeText(getApplicationContext(), "RESPOSTA ERRADA!", Toast.LENGTH_LONG).show();
                pergunta++;
                btPQ1.setEnabled(true);
                btVerificar1.setEnabled(false);
                break;
            }
            case 5:
                if (rb3.isChecked()){

                    rb3.setTextColor(Color.GREEN);
                    rb2.setTextColor(Color.RED);
                    rb1.setTextColor(Color.RED);
                    rb4.setTextColor(Color.RED);
                    Toast.makeText(getApplicationContext(), "RESPOSTA CORRETA!", Toast.LENGTH_LONG).show();
                    pergunta++;
                    pontuacao++;
                    btn_verificar();
                    btPQ1.setText("Finalizar Quiz");
                    break;

                }else {
                    rb3.setTextColor(Color.GREEN);
                    rb2.setTextColor(Color.RED);
                    rb1.setTextColor(Color.RED);
                    rb4.setTextColor(Color.RED);
                    Toast.makeText(getApplicationContext(), "RESPOSTA ERRADA!", Toast.LENGTH_LONG).show();
                    pergunta++;
                    btn_verificar();
                    btPQ1.setText("Finalizar Quiz");
                    break;

                }
        }
    }


        public void rb_change_color () {

            rb1.setTextColor(Color.BLACK);
            rb2.setTextColor(Color.BLACK);
            rb3.setTextColor(Color.BLACK);
            rb4.setTextColor(Color.BLACK);
        };

        public void rb_set_text(){

            rb1.setText(alternativas[0]);
            rb2.setText(alternativas[1]);
            rb3.setText(alternativas[2]);
            rb4.setText(alternativas[3]);
        }

        public void btn_questoes(){

            btPQ1.setEnabled(false);
            btVerificar1.setEnabled(true);
        }

        public void btn_verificar (){
            btPQ1.setEnabled(true);
            btVerificar1.setEnabled(false);
        }



    }





