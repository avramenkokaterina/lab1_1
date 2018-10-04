package main.java.avramenko;

import java.util.Scanner;

public class View {
    public int readN() {
        System.out.println("Developer: Avramenko K.A.\nEnter matrix dimension");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        return n;
    }

    public void printMatrix(long[][] matrix) {
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                System.out.printf("%4d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public void printMatrix(float[][] finalMatrix) {
        for(int i=0; i<finalMatrix.length; i++){
            for(int j=0; j<finalMatrix.length; j++){
                System.out.printf("%6.2f ", finalMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
