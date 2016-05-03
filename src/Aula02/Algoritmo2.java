package Aula02;

import java.util.Scanner;

/**
 * Created by Gabriel on 01/03/2016.
 */
/*
    2.	Faça um programa que leia um vetor unidimensional de tamanho 10,
    a leitura deve ser encerrada ao atingir o tamanho do vetor ou o usuário digitar 0.
    Ao final da leitura mostrar a soma do vetor e a média dos valores lidos.
 */
public class Algoritmo2 {
    static Scanner in = new Scanner(System.in);
    static int n=10, i=0, media=0, aux=0;
    static int[] vet = new int[n];

    public static void main(String[] args) {
        System.out.println("Informe "+ n +" valores. ");
        do{
            System.out.println("Informe o valor da posição "+ (i+1) +": ");
            aux = in.nextInt();
            if(aux==0)break;
            vet[i] = aux;
            media+= vet[i];
            i++;
        }while(i<10);
        System.out.println("Soma dos valores lidos: "+ media +"\nMédia dos valores lidos: "+ (media/i));
    }
}
