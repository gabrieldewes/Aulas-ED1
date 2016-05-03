package Aula01.Algoritmo5;

import java.util.ArrayList;

/**
 * Created by Gabriel on 27/02/2016.
 */
public class ValorMaiorQue50 {
    public static void main(String[] args) {
        boolean achou = false;
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(60);
        nums.add(10);
        nums.add(60);
        nums.add(10);
        nums.add(60);
        nums.add(10);
        nums.add(60);
        nums.add(10);
        nums.add(10);
        for(int num=0; num<nums.size(); num++)
            if(nums.get(num) >= 50){
                System.out.println("Valor "+ nums.get(num) +" encontrado na posição "+ num);
                achou=true;
            }
        if(!achou)
            System.out.println("Não foram encontrados valores maior que 50...");
    }
}
