class A
{
int a,b,c;
 void get()
{
a=10;
b=20;
}
void add()
{
c=a+b;
System.out.println("Addition:"+c);
}
}
class B extends A
{
int d,e,f;
void get1()
{
d=30;
}
void Add1()
{
e=a+d;
f=c+d;
System.out.println("Addition e="+e);
System.out.println("Addition f="+f);
}
public static void main(String args[])
{
B obj=new B();
obj.get();
obj.add();
obj.get();
obj.Add1();
}
}

