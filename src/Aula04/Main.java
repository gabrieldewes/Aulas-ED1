package Aula04;

import java.util.Scanner;

/**
 * Created by gabriel on 15/03/16.
 */
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        // Algoritmo 1
        int[] vetor = {1,1,1,1};
        System.out.println("Soma do vetor passado por parâmetro: "+ Metodos.somaVetor(vetor));

        // Algoritmo 2
        String str = "gabriel";
        System.out.println("Quantidade de vogais na palavra "+ str +": "+ Metodos.contaVogais(str));

        // Algoritmo 3
        int num=10;
        System.out.println("Retorno da função MOD: "+ Metodos.mostraPar(num));

        // Algoritmo 4
        System.out.println("Total de consoantes na palavra "+ str +": "+ Metodos.contaConsoantes(str));

        // Algoritmo 5
        int par=10, impar=25;
        System.out.println("Soma dos números, sendo que um deles é par e o outro ímpar: "+ Metodos.somaParImpar(par,impar));
    }
}
