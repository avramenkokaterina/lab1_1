package main.java.avramenko;

import java.util.Random;

public class Service {
    public static long[][] generateRandomArray(int n){
        long[][] matrix = new long[n][n];
        Random random = new Random();
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                matrix[i][j]= random.nextInt(100);
            }
        }
        return matrix;
    }

    public static float[][] matrixChange (long[][] matrix){
        int n = matrix.length;
        float[][] finalMatrix = new float[n][n];
        for (int i=0; i<n; i++){
            float average=0;
            for (int j=0; j<n; j++){
                average += matrix[i][j];
            }
            average/=n;
            for (int j=0; j<n; j++){
                finalMatrix[i][j]=matrix[i][j]-average;
            }
        }
        return finalMatrix;
    }
}
