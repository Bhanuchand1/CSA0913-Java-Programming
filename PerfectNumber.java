import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  System.out.print("enter the number");
int n = scanner.nextInt();
int sum=0;
for(int i=1;i<n;i++)
{
if(n%i==0)
{
sum+=i;
}
}
if(sum==n)
{
System.out.println("PERFECT NUMBER");
}
else
System.out.println("NOT PERFECT NUMBER");
}
}
