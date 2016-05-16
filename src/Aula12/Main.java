package Aula12;

/**
 * Created by ramon on 03/05/16.
 */
public class Main {

    public static void main(String[] args) {
        Lista agenda = new Lista();
        System.out.println(agenda);

        agenda.addInicio();
        System.out.println(agenda);
        agenda.addInicio();
        System.out.println(agenda);
        agenda.addFimEasy();
        System.out.println(agenda);
        agenda.mostrar();

    }
}
