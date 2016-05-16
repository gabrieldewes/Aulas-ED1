package Aula13;

import java.util.Scanner;

/**
 * Created by ramon on 10/05/16.
 */
public class Elemento {

    public String nome;
    public Elemento proximo;


    public void ler (){
        System.out.println("Digite nome");
        Scanner tc = new Scanner(System.in);
        this.nome=tc.next();
    }

    public void mostrar(){
        System.out.println(this.nome);
    }

}
