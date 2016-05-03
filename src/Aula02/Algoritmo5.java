package Aula02;

import java.util.Scanner;

/**
 * Created by Gabriel on 01/03/2016.
 */
/*
    5.	Faça um programa que leia uma matriz 4X4, aceitando apenas valores positivos.
    Ao final mostrar a soma de cada linha, a soma de cada coluna e a soma da matriz.
 */
public class Algoritmo5 {
    static Scanner in = new Scanner(System.in);

    static int L=4, C=4, c=0, l=0, soma;

    static int[][] mat = new int[L][C];
    static int somaL[] = new int[L];
    static int somaC[] = new int[L];

    public static void main(String[] args) {
        System.out.println("Preencha uma matriz 4x4 apenas com valores positivos: (16 valores)");
        for(l=0; l<L; l++)
            for (c=0; c<C; c++)
                mat[l][c] = in.nextInt();

        System.out.println("Soma das linhas: ");
        for (l=0; l<L; l++) {
            soma = 0;
            for (c=0; c<C; c++)
                soma += mat[l][c];
            somaL[l] = soma;
            System.out.print(somaL[l] +" | ");
        }

        System.out.println();
        System.out.println("Soma das colunas: ");
        for (l=0; l<L; l++) {
            soma = 0;
            for (c=0; c<C; c++)
                soma += mat[c][l];
            somaC[l] = soma;
            System.out.print(somaC[l] +" | ");
        }

        System.out.print("\nSoma de toda matriz: ");
        soma=0;
        for(l=0; l<L; l++)
            for (c=0; c<C; c++)
                soma += mat[l][c];
        System.out.print(soma);
    }
}
