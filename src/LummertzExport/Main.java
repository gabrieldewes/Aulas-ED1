package LummertzExport;

import LummertzExport.cr.ContainerControl;
import LummertzExport.cr.MainControl;
import LummertzExport.model.Container;
import org.joda.time.LocalTime;
import org.joda.time.Period;

import java.util.Scanner;

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
*/
public class Main extends MainControl {
    public static void main(String[] args) {
        LocalTime start = new LocalTime(System.currentTimeMillis());
        LocalTime end = new LocalTime("03:00:00");
        Period period   = new Period(start, end);
        System.out.println("Entre as duas datas há: " + period.getDays() + " dias,  "
                + period.getHours() + " horas "
                + period.getMinutes() + " minutos.");
    }

}
