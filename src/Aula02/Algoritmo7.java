package Aula02;

import java.util.Scanner;

/**
 * Created by Gabriel on 02/03/2016.
 */

/*
    Faça uma estrutura para descrever os carros de uma determinada revendedora, contendo os seguintes campos:
    marca: string
    ano: inteiro
    cor: string
    preço: real
    a) Escrever a definição da estrutura carro.
    b) Declarar o vetor vetcarros do tipo da estrutura definida acima, de tamanho 20 e global.

    Crie um menu para:
    c) Definir um bloco de programa para ler o vetor vetcarros.
    d) Definir um bloco de programa que receba um preço e imprima os carros (marca, cor e ano)
        que tenham preço igual ou menor ao preço recebido.
    e) Defina um bloco de programa que leia a marca de um carro e
        imprima as informações de todos os carros dessa marca (preço, ano e cor).
    f) Defina um bloco de programa que leia uma marca, ano e cor e informe se existe ou não um carro com essas características.
        Se existir, informar o preço.
 */

public class Algoritmo7 {

    static Scanner in = new Scanner(System.in);
    static Carro[] vetCar = new Carro[20];
    static int i=0;

    public static class Carro{
        String marca;
        String cor;
        int ano;
        float preco;
    }

    public static void main(String[] args) {
        int opt;
        do{
            System.out.print("- 1 - Ler carro\n"+
                    "- 2 - Verifica iguais por preço\n"+
                    "- 3 - Busca por marca\n"+
                    "- 4 - Busca por Marca, ano e cor\n"+
                    "- 5 - Sair\n"+
                    "- Sua opção: ");
            opt = in.nextInt();
            switch (opt){
                case 1:{
                    if(i<20)
                        LeCarro();
                    else
                        System.out.println("Limite de carros atingido. ");
                    break;
                }
                case 2:{
                    VerificaPorPreco();
                    break;
                }
                case 3:{
                    BuscaPorMarca();
                    break;
                }
                case 4:{
                    BuscaPorMarcaAnoCor();
                    break;
                }
                case 5:{
                    System.out.println("Fim...");
                    break;
                }
            }
        }while(opt != 5);
    }

    private static void LeCarro() {
        String lixo = in.nextLine();
        do{
            System.out.println("Marca: ");
            String marca = in.nextLine();
            System.out.println("Cor: ");
            String cor = in.nextLine();
            System.out.println("Ano: ");
            int ano = in.nextInt();
            System.out.println("Preço: ");
            float preco = in.nextFloat();

            vetCar[i] = new Carro();
            vetCar[i].marca = marca;
            vetCar[i].cor = cor;
            vetCar[i].ano = ano;
            vetCar[i].preco = preco;
            i++;

            lixo = in.nextLine();
            System.out.println("Mais um? s/n");
            String c = in.nextLine();
            if(!c.contentEquals("s"))
                break;
        }while(i<20);
    }

    private static void VerificaPorPreco() {
        System.out.println("Informe o preço para busca: ");
        float busca = in.nextFloat();
        boolean ok=true;
        for(int j=0; j<i; j++){
            if(vetCar[j].ano <= busca){
                System.out.println("Marca: "+ vetCar[j].marca +" // Cor: "+ vetCar[j].cor +" // Ano: "+ vetCar[j].ano);
                ok=false;
            }
        }
        if(ok)
            System.out.println("Não foram encontrados veículos com esse valor.");
    }

    private static void BuscaPorMarca(){
        String lixo = in.nextLine();
        System.out.println("Informe a marca para busca: ");
        String marca = in.nextLine();
        boolean ok=true;
        for(int j=0; j<i; j++){
            if(vetCar[j].marca.contentEquals(marca)){
                System.out.println("Preço: "+ vetCar[j].preco +" // Cor: "+ vetCar[j].cor +" // Ano: "+ vetCar[j].ano);
                ok=false;
            }
        }
        if(ok)
            System.out.println("Não foram encontrados veículos com essa marca.");
    }

    private static void BuscaPorMarcaAnoCor(){
        String lixo = in.nextLine();
        System.out.println("Informe os seguintes dados para busca: "+
                            "\nMarca: ");
        String marca = in.nextLine();
        System.out.println("Ano: ");
        int ano = in.nextInt();
        lixo = in.nextLine();
        System.out.println("Cor: ");
        String cor = in.nextLine();
        boolean ok=true;
        for(int j=0; j<i; j++){
            if(vetCar[j].marca.contentEquals(marca))
                if(vetCar[j].ano == ano)
                    if(vetCar[j].cor.contentEquals(cor)){
                        System.out.println("Achamos seu carro! \nPreço: "+ vetCar[j].preco );
                        ok=false;
                    }
        }
        if(ok)
            System.out.println("Não foram encontrados veículos com esses valores.");
    }
}
