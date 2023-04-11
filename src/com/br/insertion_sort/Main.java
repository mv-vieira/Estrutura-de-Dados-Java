package com.br.insertion_sort;

public class Main {

    public static void main(String[] args) {
        int [] vetor = new int[100];

        //Preenchendo Vetor com números aleatórios

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            // System.out.println(vetor[i]);
        }

        long inicio = System.currentTimeMillis();
        long fim;

        //Insertion Sort - Big O (O n^2) Quadrâtica

        int aux, j;

        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;

            while(j >= 0 && vetor[j] > aux) {
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
        }

        fim = System.currentTimeMillis();
        System.out.println("Tempo:" + (fim-inicio));

	/*
	 * System.out.println("-- Vetor Ordenado -- ");
	for (int i = 0; i < vetor.length; i++) {
		System.out.println(vetor[i]);
	}

	*/
    }
}

