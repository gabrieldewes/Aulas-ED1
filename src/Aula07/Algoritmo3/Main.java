package Aula07.Algoritmo3;

import java.util.Scanner;

/**
 * Created by Gabriel on 29/03/2016.
 */

/*
4- Crie um algoritimo de estrutura fila, aonde simulamos uma fila de banco.
Cada cliente deve informar o nome, cpf, idade e sexo.
se o clente possuir mais de 60 e ser do sexo feminino
ou ser masculino com mais de 65 anos
devem ser adicionado na fila Prioritários,
caso contrario adicionar na fila “atendimentoComun“.
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fila banco = new Fila();
        int opt=1;

        while (opt != 0){
            System.out.print(
                    "Fila do banco \n" +
                    "0 - Sair \n" +
                    "1 - Chegar \n" +
                    "2 - Ver fila \n" +
                    "3 - Fazer a fila andar \n" +
                    "-  ");
            opt = in.nextInt();
            switch (opt){
                case 1:
                    banco.chegar();
                    break;
                case 2:
                    banco.ver_fila();
                    break;
                case 3:
                    banco.fazer_a_fila_andar();
                    break;
            }
        }
        System.out.print("Passando pela porta magnética...");
    }
}
