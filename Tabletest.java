class FifthTable extends Thread
{
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println(i+"x5 = "+i*5);
}
}
}
class TenthTable extends Thread
{
  public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println(i+" x10= "+i*10);
}
}
}
class R192110744
{
public static void main(String arg[])
{
FifthTable  f=new FifthTable ();
TenthTable t=new TenthTable ();
f.start();
t.start();
}
}