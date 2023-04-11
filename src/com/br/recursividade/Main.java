package com.br.recursividade;

public class Main {
    public static void main(String[] args) {

        int[] vetor = new int[5];

        // Preenchendo o vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        System.out.println("-- Vetor --");
        for (int i : vetor) {
            System.out.println(i);
        }

        System.out.println("\n -- Soma --");
        System.out.println(somar(0,0,vetor));
    }


    // Método Recursivo
    private static int somar(int soma, int posicao, int[] vetor) {
        if(posicao < vetor.length) {
            soma = soma + vetor[posicao];
            return somar(soma ,posicao+1, vetor);
        }else {
            return soma;
        }
    }
}

