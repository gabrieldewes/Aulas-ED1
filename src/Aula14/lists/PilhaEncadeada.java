package Aula14.lists;

import Aula14.model.Container;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Period;

/**
 * Created by Gabriel on 22/03/2016.
 */
public class PilhaEncadeada {
    public static final int MAX_SIZE = 4;
    private static final int BASE_SIZE = -1;
    private static final long MAX_TIME = 14400000; // 4 horas em millis
    private Container FIRST;
    private Container LAST;
    private int TOP;
    private int BASE;
    private boolean IS_INIT;

    PilhaEncadeada() {
        if (!this.IS_INIT)
            this.inicializar();
    }

    private void getPeriod(Container ct) {
        long out_time = System.currentTimeMillis();
        LocalTime start = new LocalTime(out_time);
        LocalTime end = new LocalTime(ct.getIn_time()+MAX_TIME);

        Period period  = new Period(start, end);
        System.out.println(" - Restam " + period.getDays() + " dias,  "
                + period.getHours() + " horas, "
                + period.getMinutes() + " minutos.");
        if (period.getHours() >= 4) {
            System.out.println("Atenção! " + ct.getId_container() +" precisa ser removido da pilha. ");
        }
    }

    private boolean inicializar() {
        if (!this.IS_INIT) {
            this.TOP  = BASE_SIZE;
            this.BASE = BASE_SIZE;
            this.IS_INIT=true;
            //System.out.println("PilhaEncadeada inicializada");
            return true;
        }
        return false;
    }

    private boolean isEmpty(){
        return this.TOP == BASE_SIZE;
    }
    private boolean isFull(){
        return this.TOP == MAX_SIZE-1;
    }

    public boolean push(Container cr, Container[] crs){
        if (isFull()) {
            System.out.println("Esta pilha está cheia. ");
            return false;
        }
        else {
            if (this.FIRST==null) {
                this.FIRST = cr;
                this.LAST = cr;
            }
            else {
                cr.setNext(this.FIRST);
                this.FIRST = cr;
            }
            this.TOP++;
            crs[this.TOP] = cr;
            //System.out.println( crs[this.TOP].getId_container() +" adicionado");
        }
        return true;
    }

    public boolean pop(Container[] crs){
        if (!isEmpty()) {
            //System.out.println(crs[this.TOP].getId_container() + " removido");
            crs[this.TOP] = null;
            this.TOP--;
            return true;
        }
        else {
            System.out.println("Impossível remover. Pilha vazia. ");
            return false;
        }
    }

    public boolean pull(Container cr, Container[] crs){
        if(!isEmpty()) {
            crs[this.TOP] = cr;
            //System.out.println(crs[this.TOP].getId_container() + " Atualizado");
        }
        else {
            System.out.println("Impossível atualizar posição. Pilha vazia. ");
            return false;
        }
        return true;
    }

    public boolean top(Container[] crs){
        if (!isEmpty()){
            System.out.println( crs[this.TOP].getId_container() + " está no topo. ");
            return true;
        }
        return false;
    }

    public void showAll(Container[] crs) {
        if (!isEmpty()) {
            Container aux;
            aux = crs[TOP];
            while(aux!=null){
                System.out.println(" / " + aux.getId_container() + ", origem: " + aux.getOrigin()+ ", chegou ás " + new LocalTime(aux.getIn_time()));
                getPeriod(aux);
                aux = aux.getNext();
            }
        }
        else
            System.out.println("Este pátio está vazio.");
    }

}