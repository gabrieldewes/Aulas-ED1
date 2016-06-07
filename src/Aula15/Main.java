package Aula15;

/**
 * Created by Dewes on 31/05/2016.
 */
public class Main {
    public static void main(String[] args) {
        DuplamenteEncadeada de = new DuplamenteEncadeada();
        de.inserirNoFim("oliveira");
        de.inserirNoInicio("dewes");
        de.inserirNoInicio("gabriel");
        de.inserirNoFim("sou o fim!");
        de.mostrar();

        if (de.remover("dewes"))
            System.out.println("saiu!");

        de.mostrar();
    }
}
