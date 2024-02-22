class vowelsconsonents 
{
 public static void main(String[] args) 
{
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a string: ");
 String input = sc.nextLine();
 String vowels = "";
 String consonants = "";
 input = input.toLowerCase();
 for (int i = 0; i < input.length(); i++) 
{
 char ch = input.charAt(i);
 if (ch >= 'a' && ch <= 'z') 
{
 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
{
 vowels += ch;
 }
 else 
{
 consonants += ch;
 }
 }
 }
 System.out.println("Vowels: " + vowels);
 System.out.println("Consonants: " + consonants);
 }
}