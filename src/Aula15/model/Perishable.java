package Aula15.model;

/**
 * Created by gabriel on 16/05/16.
 */
public enum Perishable {
    PERECÍVEL(1), NÃO_PERECÍVEL(2);
    private final int perishable;

    Perishable(int ps){
        perishable = ps;
    }
    public int getPerishable(){ return perishable; }
}
