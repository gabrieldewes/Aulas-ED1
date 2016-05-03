package Aula01.Algoritmo3;

import java.util.Scanner;

/**
 * Created by Gabriel on 24/02/2016.
 */
public class InverteVetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=5, opt=0;
        float vet[] = new float[n];


        System.out.println("- Digite os "+n+" valores: ");
        for(int i=0; i<n; i++)
            vet[i]= in.nextFloat();
        do{
            System.out.println("- Informe: \n- 0 - Sair \n- 1 - Ordem direta \n- 2 - Ordem inversa \n- Sua opção: ");
            opt = in.nextInt();
            if(opt==0) break;
            switch (opt){
                case 1:{
                    System.out.println("- Valores do vetor em ordem direta: ");
                    for(float valor:vet)
                        System.out.println(valor);
                    break;
                }
                case 2:{
                    System.out.println("- Valores do vetor em ordem inversa: ");
                    for(int i=4; i>=0; i--)
                        System.out.println(vet[i]);
                    break;
                }
            }
        }while(opt!=0);
        System.out.print("Fim");
    }
}

