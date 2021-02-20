package com.loiane.estruturadados.aula03;

public class Vetor {

    private int[] vetor;
    private int tamanho;

    public Vetor(int capacidade) {
        this.vetor = new int[capacidade];
    }

    //adiciona elemento no vetor
    public void adicioina(int add) {
        this.tamanho++;
        for (int i = 0; i < this.vetor.length; i++) {
            if (this.vetor[i] == 0) {
                this.vetor[i] = add;
                break;

            }
        }
    }

    //verifica se o vetor está cheio
    public boolean adiciona() {
        if (tamanho > vetor.length) {
            return false;
        }
        return true;

    }
}
