package Aula07.Algoritmo1;

/**
 * Created by Gabriel on 05/04/2016.
 */
public class Main {
    public static void main(String[] args) {
        Pilha a = new Pilha();
        while (a.topo<3)
            a.insere();
        a.mostra();
        a.remove();
        a.remove();
        a.remove();
        a.mostra();
    }
}
