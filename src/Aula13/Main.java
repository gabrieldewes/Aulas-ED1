package Aula13;

import java.util.Scanner;

/**
 * Created by ramon on 10/05/16.
 */
public class Main {

    public static void main(String[] args) {
        List lista= new List();
        int op=0;
        do{
            Scanner tc = new Scanner(System.in);
            System.out.println("1 Para Add Final");
            System.out.println("2 Para Add Inicio");
            System.out.println("3 Para Add Meio");
            System.out.println("4 Remover inicio");
            System.out.println("5 Remover Fim");
            System.out.println("99 Listar");
            op=tc.nextInt();
            switch (op){
                case 1:{
                    Elemento e= new Elemento();
                    e.ler();
                    lista.addFim(e);
                    break;
                }
                case 2:{
                    Elemento e= new Elemento();
                    e.ler();
                    lista.addInicio(e);
                    break;
                }
                case 4:{

                    lista.delInicio();
                    break;
                }
                case 5:{
                   lista.delFim();
                    break;
                }
                case 99:{
                    lista.listar();
                    break;
                }

            }

        }while (op!=0);


    }
}
