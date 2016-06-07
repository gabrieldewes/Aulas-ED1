package Aula15;

/**
 * Created by Dewes on 31/05/2016.
 */
public class DuplamenteEncadeada {
    No first;
    No last;

    DuplamenteEncadeada () {
        first = last = null;
    }

    public void inserirNoFim (String id) {
        if (first == null) {
            No novo = new No();
            novo.setId(id);
            novo.setNext(null);
            novo.setPrev(novo);
            first = novo;
            last = first;
        }
        else {
            No novo = new No();
            novo.setId(id);
            novo.setNext(null);
            novo.setPrev(last);
            last.setNext(novo);
            last = novo;
        }
    }

    public void inserirNoInicio (String id) {
        if (first == null) {
            No novo = new No();
            novo.setId(id);
            novo.setNext(first);
            novo.setPrev(novo);
            first = novo;
            last = first;
        }
        else {
            No novo = new No();
            novo.setId(id);
            novo.setNext(first);
            novo.setPrev(novo);
            first = novo;
        }
    }

    public boolean remover(String id){
        No remover = first;
        while (remover != null) {
            if (remover.getId().contentEquals(id)) {
                No anterior = remover.getPrev();
                No proximo = remover.getNext();
                anterior.setNext(proximo);
                proximo.setPrev(anterior);
                return true;
            }
            remover = remover.getNext();
        }
        return false;
    }

    public void mostrar () {
        No imprime;
        imprime = first;
        while (imprime != null){
            System.out.println(imprime.getId());
            imprime = imprime.getNext();
        }
    }

}
