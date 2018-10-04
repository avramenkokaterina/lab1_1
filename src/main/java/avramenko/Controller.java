package main.java.avramenko;

public class Controller {
    public static void main(String[] args) {
        View view = new View();
        int n = view.readN();
        long[][] matrix = Service.generateRandomArray(n);
        float[][] finalMatrix = Service.matrixChange(matrix);
        view.printMatrix(matrix);
        System.out.println();
        view.printMatrix(finalMatrix);
    }
}
