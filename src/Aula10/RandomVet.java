package Aula10;

import java.util.Random;

/**
 * Created by Gabriel on 19/04/2016.
 */
public class RandomVet {
    public Integer[] getRandomVet(){
        Random r = new Random();
        int aux = 100000;
        Integer vet[] = new Integer[aux];
        for (int i=0; i<aux; i++)
            vet[i] = r.nextInt(100);
        return vet;
    }

}
