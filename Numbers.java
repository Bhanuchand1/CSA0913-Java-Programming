class Fibo extends Thread
{
	public void run()
	{
		int a=0,b=1,c;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=10;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
class ReverseOrder extends Thread
{
    public void run()
    { 
         for(int i=10;i>=1;--i)
         {
                System.out.println(i+" ");
         }
     }
}
class Numbers
{
   public static void main(String arg[])
   {
    Fibo f=new Fibo();
    ReverseOrder r=new ReverseOrder();
    f.start();
    r.start();
   }
}