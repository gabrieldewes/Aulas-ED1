package Aula17;
/**
 * Created by gabriel on 10/05/16.
 */
public class Main {

	public static void main(String[] args) {
		
		DuplamenteEncadeada de = new DuplamenteEncadeada();

		de.inserirNoFim(1);
		de.inserirNoFim(2);
		de.inserirNoFim(3);
		de.inserirNoFim(4);
		de.inserirNoFim(5);
		de.inserirNoFim(6);
		de.inserirNoFim(7);
		de.inserirNoInicio(1111);

		de.imprimir();
		
		if (de.remover(2))
			System.out.println("saiu! ");

		de.imprimir();
	}
}