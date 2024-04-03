class fib extends Thread
{
public void run()
{
int n1=0,n2=1,n3,i,count=10; 
 System.out.print(n1+" "+n2);      
 for(i=2;i<count;++i)    
{    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }   
}
}
class rev extends Thread
{
 public void run() 
{
 System.out.println("Reverse Order:");
 for (int i=10;i>=1;i--)
 {
  System.out.print(i + " ");
 }
   System.out.println();
}
}
class R192110106
{
	public static void main(String arg[])
	{
		fib f=new fib();
                f.start();
		rev t=new rev();
		t.start();	
	}
}