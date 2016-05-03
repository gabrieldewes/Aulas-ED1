package Aula02;

import java.util.Scanner;

/**
 * Created by Gabriel on 01/03/2016.
 */
/*
    3.	Faça um programa que leia um vetor de 10 elementos, o vetor deve aceitar na primeira leitura apenas valores entre 1 e 3.
    Nas leituras subsequentes o valor deve ser maior ao seu antecessor.
 */
public class Algoritmo3 {
    static Scanner in = new Scanner(System.in);
    static int n=10, aux=0, i=0;
    static boolean ok=false;
    static int[] vet = new int[n];

    public static void main(String[] args) {
        do{
            if(i==0){
                do{
                    System.out.println("Informe o primeiro valor. Apenas entre 1 e 3. ");
                    aux = in.nextInt();
                    if(aux>0 && aux<4) {
                        vet[i] = aux;
                        ok = true;
                        i++;
                        System.out.println("Informe os próximos valores. Lembrete: Maiores que o número anterior. ");
                    }else
                        System.out.println("Eu falei entre 1 e 3. ");
                }while(!ok);
            }
            else{
                do{
                    System.out.println("Vai lá. Manda o próximo valor: ");
                    aux = in.nextInt();
                    if(aux > vet[i-1]) {
                        vet[i] = aux;
                        i++;
                    }
                    else
                        System.out.println("Eu falei somente maiores que o anterior. ");
                }while(i<n);
            }
        }while(i<n);
        System.out.println("Parabéns, funcionou! ");
    }
}
