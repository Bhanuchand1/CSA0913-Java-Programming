import java.util.*;
class Palindrome
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("enter the number:");
  int n=sc.nextInt();
  int num=n;
  int rev=0;
  while(n!=0)
  {
   int digit=n%10;
   rev=rev*10+digit;
   n=n/10;
  }
  if(rev==num)
  { 
   System.out.print("is a palindrome");
  }
  else
 {
  System.out.print("is not a palindrome");
  }
 }
 }