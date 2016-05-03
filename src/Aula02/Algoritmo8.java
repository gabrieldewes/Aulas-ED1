package Aula02;

import java.util.Scanner;

/**
 * Created by Gabriel on 02/03/2016.
 */

/*
8.	Seja um algoritmo para controlar os produtos do estoque de um supermercado. Para cada produto, tem-se os seguintes campos:
nome: string
setor: caracter
quantidade: inteiro
preço: real //preço por unidade do produto
a)	Escrever a definição da estrutura produto.
b) Declarar o vetor estoque do tipo da estrutura definida acima, de tamanho 100 e global.
b)	Crie um menu para:
c) Definir um bloco de instruções para ler o vetor estoque.
d) Definir um bloco de instruções que receba um setor e devolva o número de diferentes produtos desse setor.
e) Definir um bloco de instruções que calcule e devolva o total de capital investido em produtos do supermercado.
f) Sair do Programa.
 */

public class Algoritmo8 {
    static Scanner in = new Scanner(System.in);
    static Produto[] estoque = new Produto[100];
    static int i=0;

    private static class Produto{
        String nome;
        String setor;
        int qtd;
        float preco;
    }
    private static int LeEstoque(){
        System.out.println("Digite 'sair' para interromper a leitura. ");
        while(i<100){
            System.out.println("- Produto "+i+
            "\nNome: ");
            String nome = in.next();
            if(nome.contentEquals("sair"))
                break;
            System.out.println("Setor: ");
            String setor = in.next();
            System.out.println("Quantidade: ");
            int qtd = in.nextInt();
            System.out.println("Preço:");
            float preco = in.nextFloat();

            estoque[i] = new Produto();
            estoque[i].nome=nome;
            estoque[i].setor=setor;
            estoque[i].qtd=qtd;
            estoque[i].preco=preco;
            i++;
        }
        return i;
    }

    private static void BuscaSetor(){
        boolean ok=false;
        int q=0;
        System.out.println("Informe o setor para busca: ");
        String setor = in.next();
        for (int j=0; j<i; j++) {
            if(estoque[j].setor.contentEquals(setor)){
                ok=true;
                System.out.println("Nome: "+ estoque[j].nome);
                q++;
            }
        }
        if(!ok)
            System.out.println("Não foram encontrados produtos deste setor. ");
        else
            System.out.println("Foi(ram) encontrado(s) "+ q +" produto(s) neste setor. ");
    }

    private static void CalculaCapital(){
        float total=0;
        for (int j=0; j<i; j++)
            total+= estoque[j].preco;
        System.out.println("Capital total investido no estoque: "+ total);
    }

    public static void main(String[] args) {
        in.reset();
        int opt=0;
        while(opt!=4){
            System.out.print("- 1 - Ler estoque\n"+
                    "- 2 - Busca setor\n"+
                    "- 3 - Calcula capital\n"+
                    "- 4 - Sair\n"+
                    "- Sua opção: ");
            opt = in.nextInt();
            switch (opt){
                case 1:{
                    if(i<100)
                        i = LeEstoque();
                    else
                        System.out.println("Estoque lotado. ");
                    break;
                }
                case 2:{
                    BuscaSetor();
                    break;
                }
                case 3:{
                    CalculaCapital();
                    break;
                }
                case 4:break;
            }
        }
        System.out.println("Fim...");
    }
}
