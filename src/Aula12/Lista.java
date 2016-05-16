package Aula12;

import java.util.Scanner;

/**
 * Created by ramon on 03/05/16.
 */
public class Lista {
    Contato inicio;
    int qtd;
    Contato fim;

    @Override
    public String toString() {
        return "Lista{" +
                "inicio=" + inicio +
                ", qtd=" + qtd +
                ", fim=" + fim +
                '}';
    }

    public boolean addInicio(){
        Scanner tc = new Scanner(System.in);
        if (this.inicio==null){
            Contato c = new Contato(); // cria a referencia
            c.nome = tc.next();
            c.fone = tc.next();
            this.inicio =c;
            this.qtd++;
            this.fim = this.inicio;
            return true;

        }else{
            Contato c = new Contato(); // cria a referencia
            c.nome = tc.next();
            c.fone = tc.next();
            c.proximo = this.inicio;
            this.inicio=c;
            this.qtd++;
        }
        return false;

    }

    public boolean addFimEasy(){
        Scanner tc = new Scanner(System.in);
        Contato c = new Contato(); // cria a referencia
        c.nome = tc.next();
        c.fone = tc.next();
        if (this.inicio == null){
            this.inicio =c;
            this.qtd++;
            this.fim = this.inicio;
            return true;
        }else{
            this.fim.proximo =c;
            this.fim =c;
            this.qtd++;
      return true;
        }

    }

    public void mostrar(){
        if(this.inicio == null){
            System.out.println("Lista vazia");
        }else{
            System.out.println("Lista possui :" + this.qtd);
            Contato aux = this.inicio;
            while (aux!= null){
               // aux.toString();
                System.out.println("Nome :" +aux.nome);
                aux= aux.proximo;
            }
        }

    }

}
