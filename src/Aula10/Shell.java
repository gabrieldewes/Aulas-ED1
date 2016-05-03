package Aula10;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Gabriel on 19/04/2016.
 */
public class Shell {
    static long trocas=0;
    static long comp=0;

    public void run() {
        RandomVet v = new RandomVet();
        Integer s[] = v.getRandomVet();
        long init = System.currentTimeMillis();
        this.shellSort(s);
        long end = System.currentTimeMillis();
        long diff = (end - init);
        System.out.println("Shell: "+ comp +" comparações, " + trocas +" trocas em "+ (new SimpleDateFormat("mm:ss:SS").format(new Date(diff))) +" até completar a operação. ");
    }

    public void shellSort(Integer[] nums) {
        int h = 1;
        int n = nums.length;
        while(h < n)
            h = h * 3 + 1;
        h = h / 3;
        int c, j;
        while (h > 0) {
            for (int i = h; i < n; i++) {
                comp++;
                c = nums[i];
                j = i;
                while (j >= h && nums[j - h] > c) {
                    trocas++;
                    nums[j] = nums[j - h];
                    j = j - h;
                }
                nums[j] = c;
            }
            h = h / 2;
        }
    }
}
