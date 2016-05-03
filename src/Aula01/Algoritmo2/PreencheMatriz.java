package Aula01.Algoritmo2;

/**
 * Created by Gabriel on 24/02/2016.
 */

public class PreencheMatriz {
    public static void main(String[] args) {
        int lin=4, col=10, l, c;
        int A[] = {15, 44, 23, 1, 1, 18, 17, 37, 35, 54};
        int B[] = {32, 115, 48, 55, 51, 1, -48, 85, 15, 99};
        //int[] A = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        //int[] B = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[][] C = new int[lin][col];

        for(c=0; c<col; c++){
            C[0][c] = A[c]+B[c];
            C[1][c] = A[c]-B[c];
            C[2][c] = A[c]*B[c];
            C[3][c] = A[c]/B[c];
        }
        for(l=0; l<lin; l++){
            for(c=0; c<col; c++){
                System.out.print(C[l][c] +" // ");
            }
            System.out.println();
        }
    }
}
