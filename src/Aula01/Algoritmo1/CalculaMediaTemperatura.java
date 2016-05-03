package Aula01.Algoritmo1;

import java.util.Scanner;

/**
 * Created by Gabriel on 24/02/2016.
 */
public class CalculaMediaTemperatura {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=7, j=0;
        float[] vet = new float[n]; float media=0;

        for(int i=0; i<n; i++){
            System.out.println("- Informe a temperatura do dia "+ (i+1) +": ");
            vet[i] = in.nextFloat();
            media=media+vet[i];
        }
        media=media/n;
        for(int i=0; i<n; i++){
            if(vet[i] > media)
                j=j+1;
            System.out.println("- Dia "+ i+1 +": "+ vet[i] +" graus.");
        }
        System.out.println("- Média das temperaturas: "+ media +" graus.");
        System.out.println("- Ocorreram "+ j +" dias com temperatura acima da média.");
    }
}
