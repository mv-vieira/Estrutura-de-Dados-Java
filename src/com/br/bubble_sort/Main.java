package com.br.bubble_sort;

public class Main {

    public static void main(String[] args) {

        int[] vetor = new int[100000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);

            // System.out.println(vetor[i]);
        }

        long inicio = System.currentTimeMillis();
        long fim;

        //Bubble Sort  - Big O (O n^2)
        int aux;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }

        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim - inicio));

		/*
		 *
		System.out.println("--- Vetor ordenado ---");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

		*/
    }
}
