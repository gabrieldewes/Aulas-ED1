package Aula06.fila;

import java.util.Scanner;

/**
 * Created by gabriel on 11/04/16.
 */
public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Fila p = new Fila();

        p.inicializar();
        p.add(1);
        p.add(2);
        p.add(3);
        p.mostrar();
        p.remover();
        p.mostrar();
        p.remover();
        p.mostrar();
    }
}
