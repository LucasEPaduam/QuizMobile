package com.example.quizlucas;

import java.io.Serializable;

public class Questao implements Serializable {

        private String enunciado;
        private String [] alternativas;
        private int resposta;


        public Questao(String enunciado) {
                this.enunciado = enunciado;
        }

        public Questao(int resposta) {
                this.resposta = resposta;
        }

        public String getEnunciado() {
                return enunciado;
        }

        public void setEnunciado(String enunciado) {
                this.enunciado = enunciado;
        }

        public String[] getAlternativas() {
                return alternativas;
        }

        public void setAlternativas(String[] alternativas) {
                this.alternativas = alternativas;
        }

        public int getResposta() {
                return resposta;
        }

        public void setResposta(int resposta) {
                this.resposta = resposta;
        }
}
