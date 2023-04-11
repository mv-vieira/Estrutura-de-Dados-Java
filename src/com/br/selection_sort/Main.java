package com.br.selection_sort;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        // Inserindo números aleatórios no vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        // Imprimindo vetor desordenado
        System.out.println("\n\n-- Desordenado -- ");
        for (int j : vetor) {
            System.out.println(j);
        }

        //Selection Sort / Big O - O(N^2)

        int posicao_menor, aux;
        for (int i = 0; i < vetor.length; i++) {
            posicao_menor = i;

            for (int j = i+1; j < vetor.length; j++) {
                if(vetor[j] < vetor[posicao_menor]) {
                    posicao_menor = j;
                }
            }
            aux = vetor[posicao_menor];
            vetor[posicao_menor] = vetor[i];
            vetor[i] = aux;
        }


        // Imprimindo vetor ordenado
        System.out.println("\n\n-- Ordenado -- ");
        for (int k : vetor) {
            System.out.println(k);
        }
    }
}

