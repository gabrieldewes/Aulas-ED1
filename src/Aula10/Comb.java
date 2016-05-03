package Aula10;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Gabriel on 19/04/2016.
 */
public class Comb {
    static long trocas=0;
    static long comp=0;

    public void run(){
        RandomVet v = new RandomVet();
        Integer s[] = v.getRandomVet();
        long init = System.currentTimeMillis();
        this.combSort(s);
        long end = System.currentTimeMillis();
        long diff = (end - init);
        System.out.println("Comb: "+ comp +" comparações, " + trocas +" trocas em "+ (new SimpleDateFormat("mm:ss:SS").format(new Date(diff))) +" até completar a operação. ");
    }

    public <E extends Comparable<? super E>> void combSort(E[] input) {
        int gap = input.length;
        boolean swapped = true;
        while (gap > 1 || swapped) {
            if (gap > 1)
                gap = (int) (gap / 1.247330950103979);

            int i = 0;
            swapped = false;
            while (i + gap < input.length) {
                comp++;
                if (input[i].compareTo(input[i + gap]) > 0) {
                    trocas++;
                    E t = input[i];
                    input[i] = input[i + gap];
                    input[i + gap] = t;
                    swapped = true;
                }
                i++;
            }
        }
    }
}
