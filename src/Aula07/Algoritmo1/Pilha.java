package Aula07.Algoritmo1;

import java.util.Scanner;

/**
 * Created by Gabriel on 05/04/2016.
 */
public class Pilha {
    Scanner in = new Scanner(System.in);
    char[] chars = new char[4];
    int topo = -1;
    char letra;

    public void insere(){
        System.out.println("Letras válidas: A, B, C, D. Digite uma letra para inserir: ");
        String str = in.next();
        if(isValid(str)){
            letra = str.charAt(0);
            if (!this.charExists(letra)) {
                topo++;
                chars[topo] = letra;
            }
        }
    }

    public void remove() {
        for (int i=0; i<topo; i++) {
            chars[i] = chars[i+1];
        }
        topo--;
        System.out.println("Topo removido. ");
    }

    public void mostra() {
        System.out.println("Ordem da fila: ");
        for (int i = 0; i <= topo; i++) {
            System.out.println(i+1 +"º numero: "+ chars[i]);
        }
    }

    public boolean isEmpty(){
        if(topo==-1){
            System.out.println("Topo vazio.");
            return false;
        }return true;
    }

    public boolean isFull(){
        if(topo==10){
            System.out.println("Pilha cheia.");
            return false;
        }return true;
    }

    public boolean charExists(char a){
        for (int i = 0; i <= topo; i++) {
            if(a == chars[i]) {
                System.out.println("Esta letra já foi inserida. ");
                return true;
            }
        }
        return false;
    }

    public boolean isValid(String a){
        if((a.charAt(0) == 'a') ||
            (a.charAt(0) == 'b') ||
            (a.charAt(0) == 'c') ||
            (a.charAt(0) == 'd') ||
            (a.charAt(0) == 'A') ||
            (a.charAt(0) == 'B') ||
            (a.charAt(0) == 'C') ||
            (a.charAt(0) == 'D')) {
            return true;
        }
        System.out.println("Não é uma letra válida.");
        return false;
    }
}
