package LummertzExport.cr;

import LummertzExport.model.Container;
import LummertzExport.model.Perishable;
import java.util.Scanner;
import static LummertzExport.util.CodeVerify.verify;

/**
 * Created by gabriel on 16/05/16.
 */
public class ContainerControl {
    static Scanner in = new Scanner(System.in);

    public void CheckIn () {
        System.out.println("Informações do container");
        Container ct = this.getInfo();

    }

    public void CheckOut (Container ct) {

    }

    public Container getInfo () {
        System.out.println("Código: ");
        String id_container = in.next();
        while (verify(id_container)) {
            System.out.println("Inválido. Informe novamente: ");
            id_container = in.next();
        }
        System.out.println("País origem: ");
        String origin = in.nextLine();
        System.out.println("Escolha o tipo do item: ");
        for (Perishable pr:Perishable.values()) {
            System.out.print(pr.name() +"("+ pr.getPerishable() +")" + " ");
        }
        Perishable perishable = null;
        int opt = in.nextInt();
        for (Perishable it: Perishable.values()) {
            if (it.getPerishable() == opt) {
                perishable = it;
            }
        }
        long in_time = System.currentTimeMillis();
        long out_time = 0;
        return new Container(id_container, origin, in_time, out_time, perishable);
    }
}
