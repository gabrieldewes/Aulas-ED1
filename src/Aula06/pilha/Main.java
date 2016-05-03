package Aula06.pilha;

import java.util.Scanner;

/**
 * Created by Gabriel on 22/03/2016.
 */
public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Pilha p = new Pilha();

        p.inicializar();
        p.push(1);
        p.push(3);
        p.push(5);

        p.pop();
        p.top();
        p.pull(123);
        p.top();
    }
}
