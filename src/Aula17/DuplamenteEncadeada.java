package Aula17;
/**
 * Created by gabriel on 10/05/16.
 */
public class DuplamenteEncadeada {

	No inicio;
	No fim;
	
	public DuplamenteEncadeada(){
		inicio = fim = null;
	}
	
	
	public void inserirNoFim(int valor){
		if (inicio == null){
			No novo = new No();
			novo.setValor(valor);
			novo.setProx(null);
			novo.setAnt(novo);
			
			inicio = novo;
			fim = inicio;
			
		}
		else {
			No novo = new No();
			novo.setValor(valor);
			novo.setProx(null);
			novo.setAnt(fim);
			
			fim.setProx(novo);
			fim = novo;
		}
	}
	
	public void inserirNoInicio(int valor){
		if (inicio == null) {
			No novo = new No();
			novo.setValor(valor);
			novo.setProx(inicio);
			novo.setAnt(novo);
			
			inicio = novo;
			fim = inicio;
		}
        else {
			No novo = new No();
			novo.setValor(valor);
			novo.setProx(inicio);
			novo.setAnt(novo);
			inicio = novo;
		}
	}
	
	
	
	public void imprimir(){
		No imprime;
		imprime = inicio;
		while (imprime != null){
			System.out.println(imprime.getValor());
			imprime = imprime.getProx();
		}
	}
	
	public boolean remover(int valor){
		No remover = inicio;
		while(remover != null){
			if(remover.getValor() == valor){
				No anterior = remover.getAnt();
				No proximo = remover.getProx();
				anterior.setProx(proximo);
				proximo.setAnt(anterior);
				return true;
			}
			remover = remover.getProx();
		}
		return false;
	}
	
}
