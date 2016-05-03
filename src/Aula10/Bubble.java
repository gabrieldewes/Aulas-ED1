package Aula10;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by gabriel on 12/04/16.
 */
public class Bubble {
    static long trocas=0;
    static long comp=0;

    public void run() {
        RandomVet v = new RandomVet();
        Integer s[] = v.getRandomVet();
        long init = System.currentTimeMillis();
        this.bubbleSort(s);
        long end = System.currentTimeMillis();
        long diff = (end - init);
        System.out.println("Bubble: "+ comp +" comparações, " + trocas +" trocas em "+ (new SimpleDateFormat("mm:ss:SS").format(new Date(diff))) +" até completar a operação. ");
    }

    private Integer[] bubbleSort(Integer v[]) {
        for (int i = v.length; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                comp++;
                if (v[j - 1] > v[j]) {
                    int aux = v[j];
                    v[j] = v[j - 1];
                    v[j - 1] = aux;
                    trocas++;
                }
            }
        }
        return v;
    }
}

