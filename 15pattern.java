class Main 
{
 public staƟc void main(String[] args) 
{
 int rows = 4;
 printPaƩern(rows);
 }
 public staƟc void printPaƩern(int rows) 
{
 int num = 1;
 for (int i = 1; i <= rows; i++) 
{
 for (int j = 1; j <= i; j++) 
{
 System.out.print(num * num + " ");
 num++;
 }
 System.out.println();
 }
 }
}