package Aula10;

/**
 * Created by Gabriel on 19/04/2016.
 */
/*
Produzir um programa que seja possível ordenar um vetor com 10 mil elementos com no mínimo 3 algoritmos distintos.
O programa deve ordenar e mostrar o tempo que levou para fazer a ordenação o número de comparações e o número de trocas.
Pode ser feito em apenas um programa.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Shell shell = new Shell();
        Comb comb = new Comb();
        Bubble bubble = new Bubble();
        shell.run();
        comb.run();
        bubble.run();
    }
}
