package Aula07.Algoritmo2;

/**
 * Created by Gabriel on 05/04/2016.
 */
public class Deck {
    int[] deck = new int[10];
    int topo=0;
    int guarda=0;

    public void add(){
        int a = 1;
        for (int i=0; i<10; i++) {
            deck[i] = a;
            this.topo++;
            a++;
        }
    }

    public void remove(){
        this.guarda = deck[topo-1];
        for (int i=9; i>0; i--) {
            deck[i]=deck[i-1];
        }
        deck[0] = this.guarda;
    }
}
