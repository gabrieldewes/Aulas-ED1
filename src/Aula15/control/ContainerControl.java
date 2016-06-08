package Aula15.control;

import Aula15.lists.*;
import Aula15.model.Container;
import Aula15.model.Perishable;
import java.util.Scanner;

import static Aula15.util.CodeVerify.verify;

/**
 * Created by gabriel on 16/05/16.
 */
public class ContainerControl {
    protected static final String LOGO =
            "+--+     +-+ +-+  +-+    +-+  +-+    +-+  +----+  +---+   +-------+  +------+       +----+  *-* *-*   +---*  *---*  +---+   +-------+        \n" +
            "|  |     | | | |  |  \\__/  |  |  \\__/  |  |  +-+  |    )  +--+ +--+  +----*    ##   |  +-+   \\\\ //    | * )  | + |  |    )  +--+ +--+     \n" +
            "|  +--+  | +-+ |  |  |  |  |  |  |  |  |  |  +-   | |\\\\      | |        /--+   ##   |  +-     //\\\\    | |    | * |  | |\\\\      | |       \n" +
            "+-----+  +-----+  +--+  +--+  +--+  +--+  +----+  +-+ ++     +-+      +-----+       +----+   *-* *-*  +-+    *---*  +-+ ++     +-+     ";

    public static Scanner in = new Scanner(System.in);

    private List mv;
    private List pr_A;
    private List pr_B;
    private List npr_C;
    private List npr_D;

    public ContainerControl() {
        if (mv == null)
            mv = new List();
        if (pr_A == null)
            pr_A = new List();
        if (pr_B == null)
            pr_B = new List();
        if (npr_C == null)
            npr_C = new List();
        if (npr_D == null)
            npr_D = new List();
    }

    public void Show() {
        System.out.println("#### PÁTIO DE MANOBRAS ####");
        mv.showAll(mv.crs);
        System.out.println("#### PÁTIO A ####");
        pr_A.showAll(pr_A.crs);
        System.out.println("#### PÁTIO B ####");
        pr_B.showAll(pr_B.crs);
        System.out.println("#### PÁTIO C ####");
        npr_C.showAll(npr_C.crs);
        System.out.println("#### PÁTIO D ####");
        npr_D.showAll(npr_D.crs);
    }

    public void CheckIn() {
        System.out.println("Informações do container");
        Container ct = this.getInfo();

        if (mv.push(ct, mv.crs)) {
            //mv.top(mv.crs);
            System.out.println("Check-in no pátio de manobras. ");

            int value=0;
            for (Perishable it: Perishable.values())
                if (ct.getPerishable() == it)
                     value = it.getPerishable();

            switch (value) {
                case 1: {
                    if (pr_A.push(ct, pr_A.crs)){
                        System.out.println(ct.getId_container() + " movido para o pátio A. \n");
                        mv.pop(mv.crs);
                        break;
                    }
                    else if (pr_B.push(ct, pr_B.crs)) {
                        System.out.println(ct.getId_container() + " movido para o pátio B. \n");
                        mv.pop(mv.crs);
                        break;
                    }
                    else
                        System.out.println(" -- Deu ruim meu querido, está tudo cheio. Chama o Ramon! ");
                    break;
                }
                case 2: {
                    if (npr_C.push(ct, npr_C.crs)){
                        System.out.println(ct.getId_container() + " movido para o pátio C. \n");
                        mv.pop(mv.crs);
                        break;
                    }
                    else if (npr_D.push(ct, npr_D.crs)) {
                        System.out.println(ct.getId_container() + " movido para o pátio D. \n");
                        mv.pop(mv.crs);
                        break;
                    }
                    else
                        System.out.println("Deu ruim meu querido, está tudo cheio. Chama o Ramon! ");
                    break;
                }
                default: {
                    System.out.println("Tipo de conteúdo não especificado ou inválido. ");
                    break;
                }
            }
        }
        else {
            System.out.println(" -- O pátio de manobras está lotado. Isto não deveria acontecer. Chama o Ramon! ");
        }
    }

    public void CheckOut () {
        System.out.println("Informe o pátio: A, B, C ou D: ");
        String list = in.next();
        /*
        System.out.println("Digite o código do container: ");
        String id_cr = in.next();
        while (verify(id_cr)) {
            System.out.println("Inválido. Digite novamente: ");
            id_cr = in.next();
        }
        */
        switch (list) {
            case "a": {
                pr_A.pop(pr_A.crs);
                System.out.println("Topo do pátio A se foi.");
                break;
            }
            case "b": {
                pr_B.pop(pr_B.crs);
                System.out.println("Topo do pátio B se foi.");
                break;
            }
            case "c": {
                npr_C.pop(npr_C.crs);
                System.out.println("Topo do pátio C se foi.");
                break;
            }
            case "d": {
                npr_D.pop(npr_D.crs);
                System.out.println("Topo do pátio D se foi.");
                break;
            }
        }


    }

    private Container getInfo() {
        System.out.println("Código: ");
        String id_container = in.next();
        while (verify(id_container)) {
            System.out.println("Inválido. Informe novamente: ");
            id_container = in.next();
        }
        in.nextLine();
        System.out.println("País origem: ");
        String origin = in.nextLine();
        System.out.println("Escolha o tipo do conteúdo: ");
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
        Container next = null;
        //Perishable perishable = null;
        //String origin = null;
        return new Container(id_container, origin, in_time, out_time, perishable, next);
    }

}
