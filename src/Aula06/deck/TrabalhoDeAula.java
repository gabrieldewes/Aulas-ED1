package Aula06.deck;

import java.util.Scanner;
import java.util.Arrays;

public class TrabalhoDeAula {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[] vetor = new int[10];
        int Indice = 0;

        vetor = iniciarVetor(vetor);
        mostrarMenu(Indice, vetor);
    }

    //----------------------------------------MENUS---------------------------------------------------------------------
    private static void mostrarMenu(int indice, int[]vetor){
        int op;
        do{
            System.out.print("|------------------MENU-------------------|\n");
            System.out.print("|     0 - Sair                            |\n");
            System.out.print("|     1 - Adicionar na 1ª posicao         |\n");
            System.out.print("|     2 - Adionar na ultima posicao       |\n");
            System.out.print("|     3 - Editar valor                    |\n");
            System.out.print("|     4 - Mostrar valores                 |\n");
            System.out.print("|     5 - Excluir valor                   |\n");
            System.out.print("|-----------------------------------------|\n");
            do{
                System.out.print("Informe uma operação: ");
                op = input.nextInt();

                if(op < 0 || op > 5)
                    System.out.print("Operação inválida!\n\n");
            }while(op < 0 || op > 5);

            indice = verificarOperacao(op, indice, vetor);
        }while (op != 0);
    }

    private static int verificarOperacao(int op, int qntElementos, int[]vetor){
        switch (op){
            case 1:
                qntElementos = lerPrimeiraPosicao(qntElementos, vetor);
                break;
            case 2:
                qntElementos =lerUltimaPosicao(qntElementos, vetor);
                break;
            case 3:
                editarValor(qntElementos, vetor);
                break;
            case 4:
                mostrarVetor(vetor, qntElementos);
                break;
            case 5:
                qntElementos = excluirValor(vetor, qntElementos);
                break;
            case 0:
                for(int i = 0; i < 24; i++)
                    System.out.print("\nTchau Bombomzinho s2");
                break;
        }
        return qntElementos;
    }
    //------------------------------------------------------------------------------------------------------------------


    //----------------------------------FUNCOES DO MENU-----------------------------------------------------------------
    private static int lerPrimeiraPosicao(int qnt, int[] vetor){
        System.out.print("\n\n|----------ADICIONAR VALOR----------|\n");

        if(qnt != 10){
            int num = lerValor();
            boolean verificou = false;

            if(qnt == 0){
                vetor[0] = num;
                qnt++;
                System.out.println("\nAdicionado com Sucesso\n");
                return qnt;
            }
            else{
                verificou = verificarNumero(num, vetor, qnt);

                if(verificou){
                    vetor = organizarVetorIncremeto(qnt,vetor);
                    vetor[0] = num;
                    qnt++;
                    System.out.println("\nAdicionado com Sucesso\n");
                    return qnt;
                } else
                    return qnt;
            }

        } else
            System.out.print("\nO vetor está totalmente preenchido!\nPor favor escolha outra opção!\n");
        return qnt;
    }

    private static int lerUltimaPosicao(int qnt, int[] vetor){
        if(qnt != 10){

            if(qnt == 0){
                qnt = lerPrimeiraPosicao(qnt, vetor);
            }else{
                boolean vericou = false;
                int num = lerValor();

                vericou = verificarNumero(num, vetor,qnt);

                if(vericou){
                    vetor[qnt] = num;
                    qnt++;
                    System.out.println("\nAdicionado com Sucesso\n");
                }
            }
        }else
            System.out.print("\nO vetor está totalmente preenchido!\nPor favor escolha outra opção!\n");

        return qnt;
    }

    private static void editarValor(int indice, int[]vetor){
        if(indice == 0)
            System.out.print("\nO VETOR ESTÁ VAZIO! POR FAVOR INFORME ALGUNS VALORES!\n\n");
        else{
            int indice2, num;
            boolean editou = false, verificouNumero = false;

            System.out.print("\n\n|---------EDITAR DO VETOR-----------\n");
            do{
                System.out.print("Informe o indice(0 à 9: ");
                indice2 = input.nextInt();

                if(indice2 < 0 || indice2 > 9)
                    System.out.print("\nIndice inválido! Tente novamente!\n");
                else
                {
                    if(indice2 < indice){
                        num = lerValor();

                        verificouNumero = verificarNumero(num, vetor, indice);
                        if(verificouNumero){
                            vetor[indice2] = num;
                            editou = true;
                            System.out.println("\nEditado com Sucesso\n");
                        }
                    }else
                        System.out.print("\nO indice solicitado está vazio, por favor tente outro!\n");
                }
            }while ((indice2 < 0 || indice2 > 9) || !editou);
        }
    }

    private static void mostrarVetor(int[] vetor, int qnt){

        if(qnt == 0)
            System.out.print("\nO VETOR ESTÁ VAZIO! POR FAVOR INFORME ALGUNS VALORES!\n\n");
        else
        {
            System.out.print("\n\n");
            System.out.print("|---------VALORES DO VETOR-----------\n");
            for(int i = 0; i < qnt; i++)
                System.out.println("|        "+(i+1)+"ª posicao: "+vetor[i]);
            System.out.print("|------------------------------------\n");
            System.out.print("\n\n");
        }
    }

    private static int excluirValor(int[] vetor, int qnt){
        if(qnt == 0)
            System.out.print("\nO VETOR ESTÁ VAZIO! POR FAVOR INFORME ALGUNS VALORES!\n\n");
        else
        {
            int indice;
            boolean trocou = false;

            System.out.print("|---------EXCLUIR VALOR-----------\n");
            do{
                System.out.print("Informe um indice (0 à 9): ");
                indice = input.nextInt();

                if(indice < 0 || indice >9)
                    System.out.print("\nIndice inválido! Tente outro!\n");
                else
                {
                    if(indice >= qnt)
                        System.out.print("\nO indice informado está vazio! Tente outro!\n");
                    else
                    {
                        vetor = organizarVetorDecremento(qnt, indice, vetor);
                        qnt--;

                        trocou = true;
                        return qnt;
                    }

                }
            } while((indice < 0 || indice >9) || !trocou);
        }
        return qnt;
    }
    //------------------------------------------------------------------------------------------------------------------


    //------------------------------VERIFICADORES,LEITORES E CONSTRUTORES-----------------------------------------------
    private static int lerValor(){
        int num;

        do{
            System.out.print("|   Informe um valor: ");
            num = input.nextInt();

            if(num == 0)
                System.out.print("\nO valor zero não é aceito!\nInforme outro valor!");
        }while (num == 0);

        return num;
    }

    private static int[] organizarVetorIncremeto(int qnt, int[]vetor){
        for(int i = qnt; i > 0; i--){
            vetor[i] = vetor[i-1];
        }
        return vetor;
    }

    private static int[] organizarVetorDecremento(int indiceTotal, int indiceInicial, int[] vetor){
        for(int i = indiceInicial; i < indiceTotal-1; i++){
            vetor[i] = vetor[i+1];
        }
        vetor[indiceTotal-1] = 0;

        return vetor;
    }

    private static boolean verificarNumero(int num, int[] vetor, int qntIndice){
        boolean vericar = false;

        for(int i = 0; i < qntIndice; i++){
            if(vetor[i] == num){
                vericar = false;
                System.out.print("\nO numero informado já consta no vetor, por favor tente outro!\n\n");
                break;
            }
            else
                vericar = true;
        }
        return vericar;
    }

    private static int[] iniciarVetor(int[] vetor){
        Arrays.fill(vetor, 0);
        //a função acima tem o mesmo efeito que o comando abaixo
       // for(int i = 0; i < vetor.length; i++)
         //   vetor[i] = 0;

        return vetor;
    }
    //------------------------------------------------------------------------------------------------------------------

}
