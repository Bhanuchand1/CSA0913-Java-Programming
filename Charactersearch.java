class Chara
{
 public static void main(String[] args)
{
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter a string: ");
 String str1 = scanner.nextLine();
 System.out.println("Enter a character to search: ");
 char find = scanner.next().charAt(0);
 boolean isFound = false;
 for (int i = 0; i < str1.length(); i++) {
 if (str1.charAt(i) == find) {
 System.out.println("Character found at index: " + i);
 isFound = true;
 break;
 }
 }
 if (!isFound)
 {
 System.out.println("Character not found in the string.");
 }
 scanner.close();
 }
}