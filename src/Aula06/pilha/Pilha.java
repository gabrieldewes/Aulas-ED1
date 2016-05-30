package Aula06.pilha;

/**
 * Created by Gabriel on 22/03/2016.
 */
public class Pilha {
    int topo;
    int base;
    boolean isInit;
    int[] vet= new int[10];

    public boolean inicializar() {
        //inicializar
        this.topo=-1;
        this.base=-1;
        this.isInit=true;
        System.out.println("PilhaEncadeada inicializada");
        return true;
    }

    public boolean isEmpty(){
        return this.topo == -1;
    }
    public boolean isFull(){
        return this.topo == 9;
    }

    public boolean push(int a){

        if (isFull()) {
            System.out.println("PilhaEncadeada Cheia Windows Me");
            return false;
        }
        else {
            if (this.isInit) {
                this.topo++;
                this.vet[this.topo] =a;
                System.out.println(this.vet[this.topo] +" adicionado");
                return true;
            }
            else {
                System.out.println("PilhaEncadeada nao inicializada");
                return false;
            }
        }
    }

    public boolean pop(){

        if (isEmpty()){
            System.out.println("PilhaEncadeada vazia Windows Me");
            return false;
        }else{
            System.out.println(this.vet[this.topo] +" removido");
            this.topo--;
            return true;
        }
    }

    public boolean pull(int b){

        if(isEmpty()){
            System.out.println("PilhaEncadeada vazia Windows Me");
            return false;
        }else{
            this.vet[this.topo]=b;
            System.out.println(this.vet[this.topo] + " Atualizado");
            return true;
        }

    }
    public boolean top(){
        if (!isEmpty()){
            System.out.println(this.vet[this.topo] + " TOP");
            return true;
        }else{
            System.out.println(" pilha vazia");
            return false;

        }
    }

}