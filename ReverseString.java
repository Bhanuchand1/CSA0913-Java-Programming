import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        String original = "TEMPLE";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseString(String str) {
        
        String reversed = "";

        
        for (int i = str.length() - 1; i >= 0; i--) {
            
            reversed += str.charAt(i);
        }

        
        return reversed;
    }
}