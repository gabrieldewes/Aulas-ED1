package Aula01.Algoritmo6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Gabriel on 27/02/2016.
 */

public class MediaFrequentadoresPraca {

    public static void main(String[] args) {
        int idade=0, menor=0;
        float media=0;
        String nome;
        Scanner in = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>(100);

        System.out.println("Digite 'sair' para exibir os resultados.");
        for(int i=0; i<100; i++){
            System.out.println("Informe o nome: ");
            nome = in.nextLine();
            if(nome.contentEquals("sair"))
                break;
            System.out.println("Informe a idade: ");
            idade = in.nextInt();
            media+=idade;
            in.reset();

            Pessoa ps = new Pessoa();
            ps.setNome(nome);
            ps.setIdade(idade);

            pessoas.add(ps);
        }

        media = media/pessoas.size();
        for(int j=0; j<pessoas.size(); j++){
            if(idade==0)
                idade = pessoas.get(j).getIdade();
            if(menor==0)
                menor = pessoas.get(j).getIdade();
            if(pessoas.get(j).getIdade() > idade)
                idade = pessoas.get(j).getIdade();
            if(pessoas.get(j).getIdade() < menor)
                menor = pessoas.get(j).getIdade();
        }
        System.out.println("Maior idade: "+ idade +"\nMédia de idades: "+ media +"\nMenor idade: "+ menor +"\n");

        for(int j=0; j<pessoas.size(); j++){
            idade = pessoas.get(j).getIdade();
            nome = pessoas.get(j).getNome();
            System.out.println("Pessoa "+ (j+1) +"\n- Nome: "+ nome +"\n- Idade: "+ idade);
        }
    }
}

