public class reverse 
{
 public static void main(String[] args) 
{
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a word: ");
 String word = scanner.nextLine();

 String reversedWord = reverseWord(word);

 System.out.println("Reverse String: " + reversedWord);
 }

 public static String reverseWord(String word) {
 String reversedWord = "";
 for (int i = word.length() - 1; i >= 0; i--) {
 reversedWord += word.charAt(i);
 }
 return reversedWord;
 }
}