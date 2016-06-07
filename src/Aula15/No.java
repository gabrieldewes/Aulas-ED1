package Aula15;

/**
 * Created by Dewes on 31/05/2016.
 */
public class No {
    private String id;
    private No next;
    private No prev;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public No getNext() {
        return next;
    }
    public void setNext(No next) {
        this.next = next;
    }
    public No getPrev() {
        return prev;
    }
    public void setPrev(No prev) {
        this.prev = prev;
    }
}
