package Aula07.Algoritmo2;

/**
 * Created by Gabriel on 05/04/2016.
 */
public class Main {
    public static void main(String[] args) {
        Deck d = new Deck();
		int a=1;

		d.add();
		for (int i = 0; i < 10; i++) {
			System.out.println("Posição "+ a +": "+ d.deck[i]);
            a++;
		}

		int b=1;
		System.out.println("\nAlterando...\n");
        d.remove();
        d.remove();
        d.remove();
		for (int i = 0; i < 10; i++) {
			System.out.println("Posição "+ b +": "+ d.deck[i]);
			b++;
		}
    }
}
