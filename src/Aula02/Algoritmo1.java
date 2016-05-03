package Aula02;

import java.util.Scanner;

/**
 * Created by Gabriel on 01/03/2016.
 */
/*
    1.	Faça um programa que leia um vetor unidimensional de tamanho 10, aonde os valores devem ser entre 1 e 10.
    Ao final da leitura mostrar a soma do vetor. Mostrar o menor elemento lido e o maior.
*/
public class Algoritmo1 {
    static Scanner in = new Scanner(System.in);
    static int n=10, soma=0, maior=0, menor=0;
    static int[] vet = new int[n];

    public static void main(String[] args) {
        System.out.println("Informe "+ n +" valores. Eles devem ser entre 1 e 10, por favor. \n");
        for(int i=0; i<n; i++){
            System.out.println("Informe o valor da posição "+ (i+1) +": ");
            vet[i] = in.nextInt();
            soma += vet[i];
        }
        for(int i=0; i<n; i++){
            if(maior==0)
                maior=vet[i];
            if(menor==0)
                menor=vet[i];
            if(vet[i] > maior)
                maior = vet[i];
            if(vet[i] < menor)
                menor = vet[i];
        }
        System.out.println("Soma de todos valores do vetor: "+ soma +"\nMaior valor: "+ maior +"\nMenor valor: "+ menor);
    }
}
