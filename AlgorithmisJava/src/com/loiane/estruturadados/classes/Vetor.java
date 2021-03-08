package com.loiane.estruturadados.classes;

import java.util.Arrays;

public class Vetor {

    private int[] vetor;
    private int tamanho;

    public Vetor(int capacidade) {
        this.vetor = new int[capacidade];
    }

    public void adiciona(int index){
        int[] aux = new int[this.vetor.length + 1];

        for(int i = 0; i < this.vetor.length; i ++){
            this.vetor[i] = aux[i];
        }
        aux[this.vetor.length] = index;
        vetor = aux;
    }

    public int busca(int posicao) throws IllegalAccessException {
        if (posicao >= 0 && posicao < tamanho){
            throw new IllegalAccessException("Posição invalida");
        }
        return vetor[posicao];
    }

    @Override
    public String toString() {
        return "Vetor{" +
                "vetor=" + Arrays.toString(vetor) +
                '}';
    }
}
