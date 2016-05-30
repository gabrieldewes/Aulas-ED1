package LummertzExport.lists;

import LummertzExport.model.Container;
import org.joda.time.LocalTime;
import org.joda.time.Period;

/**
 * Created by Gabriel on 22/03/2016.
 */
public class PilhaEncadeada {
    public static final int MAX_SIZE = 4;
    private static final int MIN_SIZE = -1;
    private static final int MAX_TIME = 14400; // 4 horas = 14400 secs
    private int TOP;
    private int BASE;
    private String NEXT_CR;
    private String PREV_CR;
    private boolean IS_INIT;

    private static int[] vet = new int[MAX_SIZE];

    public PilhaEncadeada() {
        if (!this.IS_INIT)
            this.inicializar();
    }

    public void toHoursMillisecs (Container cr) {
        LocalTime start = new LocalTime("10:40:00");
        LocalTime end = new LocalTime("10:00:00");
        Period period   = new Period(start, end);
        System.out.println("Entre as duas datas há: " + period.getDays() + " dias,  "
                + period.getHours() + " horas "
                + period.getMinutes() + " minutos.");
    }

    public boolean inicializar() {
        if (!this.IS_INIT) {
            this.TOP=MIN_SIZE;
            this.BASE=MIN_SIZE;
            this.IS_INIT=true;
            System.out.println("PilhaEncadeada inicializada");
            return true;
        }
        return false;
    }

    private boolean isEmpty(){
        return this.TOP == MIN_SIZE;
    }
    private boolean isFull(){
        return this.TOP == MAX_SIZE;
    }

    public Container[] push(Container cr, Container[] crs){
        if (isFull()) {
            System.out.println("Esta pilha ja esta cheia. Redirecionando para outra...");
            return null;
        }
        else {
            if ( this.IS_INIT ){
                this.TOP++;
                crs[this.TOP] = cr;
                System.out.println( crs[this.TOP] +" adicionado");
                return crs;
            }
            else {
                System.out.println("PilhaEncadeada nao inicializada");
                return null;
            }
        }
    }

    public boolean pop(Container cr, Container[] crs){

        if (isEmpty()){
            System.out.println("PilhaEncadeada");
            return false;
        }
        else {
            System.out.println(crs[this.TOP] +" removido");
            this.TOP--;
            return true;
        }
    }

    public boolean pull(Container cr, Container[] crs){

        if(isEmpty()){
            System.out.println("PilhaEncadeada vazia Windows Me");
            return false;
        }
        else {
            crs[this.TOP]=cr;
            System.out.println(crs[this.TOP] + " Atualizado");
            return true;
        }

    }
    public boolean top(Container[] crs){
        if (!isEmpty()){
            System.out.println(crs[this.TOP] + " TOP");
            return true;
        }else{
            System.out.println(" pilha vazia");
            return false;

        }
    }

}