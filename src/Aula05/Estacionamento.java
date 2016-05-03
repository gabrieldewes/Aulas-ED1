package Aula05;

import java.util.Scanner;

/**
 * Created by Gabriel on 22/03/2016.
 */
public class Estacionamento {

    int topo=-1;
    Scanner in = new Scanner(System.in);
    String[] vetor = new String[10];


    public void InserirCarro (){
        if (topo == 9){
            System.out.println("Estacionamento cheio!");
        }
        else {
            topo++;
            System.out.println("Numero da Placa:");
            this.vetor[this.topo] = in.next();
        }
    }

    public void RetirarCarro() {
        int manobras = 0;
        boolean search = false;
        String procuraCarro;
        if (topo == -1){
            System.out.println("Estacionamento vazio! ");
        }
        else {
            System.out.print("Digite a placa do carro para remover: ");
            procuraCarro = in.next();

            for (int i=0; i<=topo;i++){
                if (procuraCarro.equals(vetor[i])){
                    search = true;
                    if (i == topo){
                        topo--;
                    }
                    else {
                        vetor[i] = vetor[i + 1];
                        manobras = i;
                        topo--;
                    }
                    System.out.println("Carro removido...");
                }
                if (search) {
                    vetor[i] = vetor[i+1];
                    manobras = (topo +1) - manobras;
                    System.out.println("Número de manobras: "+ manobras);
                }
                else
                    System.out.println("Nenhum veículo encontrado!");
            }
        }

    }

    public void ExibirVeiculos(){
        if (topo == -1){
            System.out.println("Estacionamento vazio!");
        }else{
            for (int i=topo; i<=topo; i--){
                System.out.println("Posição: " + i + "/ Placa: " + vetor[i]);
                if (i == 0){
                    break;
                }
            }
        }
    }
}
