package Aula14.model;

/**
 * Created by gabriel on 16/05/16.
 */
public class Container {
    private String id_container;
    private String origin;
    private Long in_time;
    private Long out_time;
    private Perishable perishable;
    private Container next;

    Container() {

    }

    public Container(String id_container, String origin, Long in_time, Long out_time, Perishable perishable, Container next) {
        this.id_container = id_container;
        this.origin = origin;
        this.in_time = in_time;
        this.out_time = out_time;
        this.perishable = perishable;
        this.next = next;
    }

    public String getId_container() {
        return id_container;
    }
    public void setId_container(String id_container) {
        this.id_container = id_container;
    }
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public Long getIn_time() {
        return in_time;
    }
    public void setIn_time(Long in_time) {
        this.in_time = in_time;
    }
    public Long getOut_time() {
        return out_time;
    }
    public void setOut_time(Long out_time) {
        this.out_time = out_time;
    }
    public Perishable getPerishable() {
        return perishable;
    }
    public void setPerishable(Perishable perishable) {
        this.perishable = perishable;
    }
    public Container getNext() {
        return next;
    }
    public void setNext(Container next) {
        this.next = next;
    }

}
