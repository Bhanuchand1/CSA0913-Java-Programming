class Bank
{
double p,n,r,Sintrest,Iintrest,Aintrest;
void get(double pr,double no)
{
p=pr;
n=no;
}
void SBI(double r)
{
Sintrest = (p*n*r)/100;
}
void ICIC(double r)
{
Iintrest = (p*n*r)/100;
}
void AXIS(double r)
{
Aintrest = (p*n*r)/100;
}
void display()
{
System.out.println("SBI : "+Sintrest);
System.out.println("ICIC : "+Iintrest);
System.out.println("AXIS : "+Aintrest);
}
public static void main(String arg[])
{
Bank b=new Bank();
b.get(100000,5);
b.SBI(8.4);
b.ICIC(7.3);
b.AXIS(9.7);
b.display();
}
}