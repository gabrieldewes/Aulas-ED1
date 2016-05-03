package Aula04;

/**
 * Created by gabriel on 15/03/16.
 */
public class Metodos {
    public static int somaVetor(int vetor[]){
        int soma=0;
        for(int num:vetor)
            soma+=num;
        return soma;
    }

    public static int contaVogais(String str){
        return str.replaceAll("[^aeiouAEIOU]","").length();
    }

    public static int mostraPar(int num){
        return num%2;
    }

    public static int contaConsoantes(String str){
        return str.replaceAll("[^bcdfghjklmnpqrstvxwyzBCDFGHJKLMNPQRSTVXWYZ]","").length();
    }

    public static int somaParImpar(int par, int impar){
        if(par%2==0)
            if(impar%2!=0)
                return par+impar;
        else
                System.out.println("Os números estão errados. ");
        return 0;
    }
}
