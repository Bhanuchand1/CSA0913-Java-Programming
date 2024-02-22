class usernamevalidornot 
{
 public static void main(String[] args) 
{
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter your username: ");
 String username = scanner.nextLine();
 if (isValidUsername(username)) {
 System.out.println("Valid username!");
 }
 else 
{
 System.out.println("Invalid username. Please check the criteria.");
 }
 scanner.close();
 }
 private static boolean isValidUsername(String username)
{
 int minLength = 7;
 return username.length() >= minLength;
 }
}