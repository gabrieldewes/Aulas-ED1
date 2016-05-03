package Aula02;

/**
 * Created by Gabriel on 01/03/2016.
 */
/*
    4.	Faca um programa que leia um vetor de 5 elementos,
    apos a leitura os valores devem ser copiados para um novo vetor, na ordem inversa.
 */
public class Algoritmo4 {
    static int[] vet = {1, 2, 3, 4, 5};
    static int[] inverso = new int[5];

    public static void main(String[] args) {
        for(int i=0; i<vet.length; i++){
            inverso[i] = vet[(vet.length-1)-i];
            System.out.print(inverso[i] +" - ");
        }
    }
}
