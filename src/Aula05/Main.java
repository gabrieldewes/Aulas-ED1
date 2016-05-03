package Aula05;

import java.util.Scanner;

/**
 * Created by Gabriel on 22/03/2016.
 */
public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Estacionamento e = new Estacionamento();
        int opt = 1;
        while (opt != 0){
            System.out.print(
                    "0 - Sair \n" +
                    "1 - Inserir Carro \n" +
                    "2 - Retirar carro \n" +
                    "3 - Exibir carros \n" +
                    "- Sua opção: ");
            opt = in.nextInt();
            switch (opt){
                case 1:
                    e.InserirCarro();
                    break;
                case 2:
                    e.RetirarCarro();
                    break;
                case 3:
                    e.ExibirVeiculos();
                    break;
            }
        }
    }
}
