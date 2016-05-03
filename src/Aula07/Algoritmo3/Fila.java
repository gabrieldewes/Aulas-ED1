package Aula07.Algoritmo3;

import java.util.Scanner;

/**
 * Created by Gabriel on 29/03/2016.
 */
public class Fila {

    Scanner in = new Scanner(System.in);
    String[] prioridade = new String[10];
    String[] comum = new String[10];
    int topoP = -1;
    int topoC = -1;

    public void chegar() {
        int sex=0;
        while (sex==0) {
            System.out.println("Olá! Seu nome? ");
            String nome = in.next();
            System.out.print(
                    "Informe seu sexo \n" +
                            "1 - Masculino \n" +
                            "2 - Feminino \n" +
                            "- ");
            sex = in.nextInt();
            switch (sex) {
                case 1:{
                    System.out.print("Sua idade: ");
                    int idade = in.nextInt();
                    if (idade > 64) {
                        topoP++;
                        prioridade[topoP] = nome;
                        break;
                    }
                    else {
                        topoC++;
                        comum[topoC] = nome;
                        break;
                    }
                }
                case 2:{
                    System.out.print("Sua idade: ");
                    int idade = in.nextInt();
                    if (idade > 59) {
                        topoP++;
                        prioridade[topoP] = nome;
                        break;
                    }
                    else {
                        topoC++;
                        comum[topoC] = nome;
                        break;
                    }
                }
            }
        }
    }

    public void fazer_a_fila_andar() {
        for (int i=0; i<=topoP; i++) {
            prioridade[i] = prioridade[i+1];
        }
        topoP--;
        System.out.println("Fila da prioridade andou!");
        for (int i=0; i<=topoC; i++) {
            comum[i] = comum[i+1];
        }
        topoC--;
        System.out.println("Parece que a comum também");
    }

    public void ver_fila() {
        System.out.println("Ordem da fila comum");
        for (int i=0; i<=topoC; i++) {
            System.out.println(i+1 +"° / Nome: "+ comum[i]);
        }
        System.out.println("Ordem da fila prioritária");
        for (int i=0; i<=topoP; i++) {
            System.out.println(i+1 +"° / Nome: "+ prioridade[i]);
        }
    }

}
