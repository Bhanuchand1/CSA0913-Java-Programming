import java.util.Scanner;

public class BinaryConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryInput = scanner.next();

        int decimalResult = binaryToDecimal(binaryInput);
        System.out.println("Decimal equivalent: " + decimalResult);

        String octalResult = decimalToOctal(decimalResult);
        System.out.println("Octal equivalent: " + octalResult);

        scanner.close();
    }

    private static int binaryToDecimal(String binary) {
        int decimal = 0;
        int binaryLength = binary.length();

        for (int i = 0; i < binaryLength; i++) {
            int digit = Character.getNumericValue(binary.charAt(i));
            decimal += digit * Math.pow(2, binaryLength - 1 - i);
        }

        return decimal;
    }

    private static String decimalToOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }
}
