package Aula14;

import Aula14.control.ContainerControl;

/**
 * Created by gabriel on 10/05/16.
 */
/*
A Empresa Lummertz export trabalha com importação de produtos que vem por meio de conteiners de varios locais do mundo.
Em seu pátio ela pode armazenar até 20 conteiners, entretanto é necessario seguir algumas regras.
Os containers devem ser empilhados comforme o produto, perecível ou não-perecivel.
É recomendado que seja empilhado no maximo 4 conteiners, entretanto é permitido que por até 4 horas uma pilha possua 5 conteiners.
A Area de manobra é utilizada apenas para manobrar conteiners quando chega os caminhões que trazem ou levam os containers.
Cada conteiner possui um codigo formado por 2 letras e 4 numeros, o pais de origem, o tempo que esta no patio e o tipo de produto (perecível ou não perecível).
O programa deve informar quando uma pilha de conteiners com 5 conteiner está para chegar em 4 horas, emitindo um alerta ao operador do guindaste.
Conteiners contendo procutos perecíveis, não podem ficar mais de 24 horas no patio, o programa deve alertar o operador sobre essa condição.
O programa deve permitir tambem a remoção do conteiner.

!!!!!!!!!!!!!!!!!! meia boca
OBS: Quando vai colocar no pátio B ele pega todos do pátio A e mais o novo
OBS²: check-out só tira o topo, para tirar do meio teria que mover pra o patio de manobra (situação real) e daria mais trabalho

*/
public class LummertzExport extends ContainerControl {
    public static void main(String[] args) {
        System.out.println(LOGO);
        System.out.println("Bem vindo ao painel de controle da Lummertz Export. ");
        ContainerControl cc = new ContainerControl();

        String opt = "gabriel";
        while (!opt.contentEquals("0")) {
            System.out.println(
                    "CHECK-IN (1) - " +
                    "CHECK-OUT (2) - " +
                    "VIZUALIZAR (3) - " +
                    "SAIR (0)");
            opt = in.next();
            switch (opt) {
                case "1": {
                    cc.CheckIn();
                    break;
                }
                case "2": {
                    cc.CheckOut();
                    break;
                }
                case "3": {
                    cc.Show();
                    break;
                }
                case "0": {
                    System.out.println("Juntando as coisinhas e indo embora...");
                    break;
                }
                default: {
                    System.out.println("Inválido! ");
                    break;
                }
            }


        }
    }
}
