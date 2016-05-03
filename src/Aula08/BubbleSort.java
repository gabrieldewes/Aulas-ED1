package Aula08;
/**
 * Created by gabriel on 12/04/16.
 */
public class BubbleSort {
    /*
        No melhor caso, o algoritmo executa 'n' operações relevantes,
        onde n representa o número de elementos do vetor.
        No pior caso, são feitas 'n²' operações. A complexidade desse algoritmo
        é de Ordem quadrática. Por isso, ele não é recomendado para programas que
        precisem de velocidade e operem com quantidade elevada de dados.
    */
    public int[] bubbleSort(int v[]) {
        for (int i = v.length; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                if (v[j - 1] > v[j]) {
                    int aux = v[j];
                    v[j] = v[j - 1];
                    v[j - 1] = aux;
                }
            }
        }
        return v;
    }
}
/*
   Em matemática, uma função é de Ordem quadrática (ou ainda, apresenta
   crescimento quadrático) quando os valores de seu resultado
   são proporcionais ao quadrado do valor do seu argumento
  (comumente representado por x). Na Notação O: f(x) = O(x²)
 */
