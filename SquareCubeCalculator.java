import java.util.Scanner;

public class SquareCubeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double square = Math.pow(number, 2);
        System.out.println("Square of the number: " + square);

        double cube = Math.pow(number, 3);
        System.out.println("Cube of the number: " + cube);

        scanner.close();
    }
}
