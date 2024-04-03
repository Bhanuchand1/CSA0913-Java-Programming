
public class StringMethodsExample {
    public static void main(String[] args) {
        String str1 = new String();
        String str2 = new String("Hello, World!");
        char[] charArray = {'J', 'a', 'v', 'a'};
        String str3 = new String(charArray);
        byte[] byteArray = {65, 66, 67, 68};
        String str4 = new String(byteArray);

        System.out.println("String Constructors:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println("str4: " + str4);

        String text = "    Java Programming    ";

        System.out.println("\nOriginal Text: \"" + text + "\"");
        System.out.println("Length: " + text.length());
        System.out.println("Substring(5, 10): " + text.substring(5, 10));
        System.out.println("To Uppercase: " + text.toUpperCase());
        System.out.println("To Lowercase: " + text.toLowerCase());
        System.out.println("Trim: \"" + text.trim() + "\"");
        System.out.println("Replace 'a' with 'X': " + text.replace('a', 'X'));
        System.out.println("Contains 'Java': " + text.contains("Java"));
        System.out.println("Index of 'Programming': " + text.indexOf("Programming"));
    }
}
