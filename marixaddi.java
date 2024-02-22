import java.util.Scanner;

public class MatrixAddition {  
    public static void main(String args[]) {     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements for matrix A (2x2):");
        int a[][] = new int[2][2];
        for(int i = 0; i < 2; i++) {    
            for(int j = 0; j < 2; j++) {
                System.out.print("Enter element at position [" + (i+1) + "][" + (j+1) + "]: ");
                a[i][j] = sc.nextInt(); // Corrected the scanner object to sc
            }
        }
        
        System.out.println("Enter elements for matrix B (2x2):");
        int b[][] = new int[2][2];
        for(int i = 0; i < 2; i++) {    
            for(int j = 0; j < 2; j++) {
                System.out.print("Enter element at position [" + (i+1) + "][" + (j+1) + "]: ");
                b[i][j] = sc.nextInt(); // Corrected the scanner object to sc
            }
        }
        
        int c[][] = new int[2][2];   
        for(int i = 0; i < 2; i++) {    
            for(int j = 0; j < 2; j++) {    
                c[i][j] = a[i][j] + b[i][j]; // Perform addition instead of multiplication
                System.out.print(c[i][j] + " "); 
            }  
            System.out.println();   
        }
        sc.close(); // Corrected the scanner object to sc
    }
}

