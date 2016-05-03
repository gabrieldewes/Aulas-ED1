package Aula02;

import java.util.Scanner;

/**
 * Created by Gabriel on 02/03/2016.
 */
/*
    6.	Faça um programa que leia um “struct” de funcionários que contenha Nome, Cargo e Salario.
 */
public class Algoritmo6 {
    public static class Funcionario{
        String nome;
        String cargo;
        float salario;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Funcionario func = new Funcionario();
        System.out.println("Nome: ");
        func.nome = in.nextLine();

        System.out.println("Cargo: ");
        func.cargo = in.nextLine();

        System.out.println("Salário: ");
        func.salario = in.nextFloat();

        System.out.println("Nome do rapaz: "+ func.nome +
                "\nCargo do mesmo: "+ func.cargo +
                "\nSalário: "+ func.salario);
    }
}
