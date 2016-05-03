package Aula01.Algoritmo4;

import java.util.ArrayList;

/**
 * Created by Gabriel on 27/02/2016.
 */
public class PreencheVetores {
    public static void main(String[] args) {
        int n=5, N=10, a=0, A=0;
        int n1[] = {4, 7, 5, 8, 2, 15, 9, 6, 10, 11};
        int n2[] = {3, 4, 5, 8, 2};
        int vet1[] = new int[n];
        int vet2[] = new int[n];

        for(int i=0; i<N; i++){
            if(n1[i]%2==0){
                vet1[a] = n1[i];
                for(int j=0; j<n; j++)
                    vet1[a] += n2[j];
                a++;
            }else{
                vet2[A] = n1[i];
                for(int j=0; j<n; j++)
                    vet2[A] = n2[j];
                A++;
            }
        }
        for(int i=0; i<n; i++)
            System.out.print(vet1[i] +" - ");
        System.out.println();
        for(int i=0; i<n; i++)
            System.out.print(vet2[i] +" - ");
    }
}
