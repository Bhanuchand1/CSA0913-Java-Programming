import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       {
 int sum=0;
int rem=0;
int n = scanner.nextInt();
int originalnum=n;
while(n!=0)
{
rem=n%10;
sum+=Math.pow(rem,3);
n=n/10;
}
if(sum==originalnum)
{
System.out.println("ARMSTRONG NUMBER");
}
else
System.out.println(" NOT ARMSTRONG NUMBER");
}
}
}
