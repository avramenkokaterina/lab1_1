package main.java.avramenko;

public class Controller {
    public static void main(String[] args) {
        View view = new View();
        int n = view.readN();
        long[][] matrix = Service.generateRandomArray(n);
        float[][] finalMatrix = Service.matrixChange(matrix);
        System.out.println("Developer: Kateryna Avramenko/n Enter matrix dimension/n");
        view.printMatrix(matrix);
        view.printMatrix(finalMatrix);
    }
}
