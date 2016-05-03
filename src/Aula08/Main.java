package Aula08;

/**
 * Created by gabriel on 12/04/16.
 */
public class Main {
    public static void main(String[] args) {
/*
        A ideia é percorrer o vetor diversas vezes,
        a cada passagem fazendo flutuar para o topo
        o maior elemento da sequência.
*/
        int[] sorts = {8,7,9,3,4,1,2,6,5};
        BubbleSort bolha = new BubbleSort();
        bolha.bubbleSort(sorts);

        for (int i=sorts.length-1; i>=0; i--)
            System.out.println(sorts[i]);

        System.out.println();

        for (int sort : sorts)
            System.out.println(sort);
    }
}
