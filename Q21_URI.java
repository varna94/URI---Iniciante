
package q21_uri;

import java.util.Scanner;

public class Q21_URI {

   
    public static void main(String[] args) {
        
        
         
        Scanner valor = new Scanner(System.in);
        
        float N = valor.nextFloat();
        
        
        float A = N / 100; 
        float B = ( N % 100) / 50; 
        float C = ((N % 100) % 50) / 20;
        float D = (((N % 100) % 50) % 20) / 10; 
        float E = ((((N % 100) % 50) % 20) % 10) / 5; 
        float F = (((((N % 100) % 50) % 20) % 10) % 5) / 2;
        float G = ((((((N % 100) % 50) % 20) % 10) % 5) % 2) / 1;
        
        Math.ceil(N);
        
       
        System.out.println(N);
        System.out.println(A+ " nota(s) de R$ 100,00");
        System.out.println(B+ " nota(s) de R$ 50,00");
        System.out.println(C+ " nota(s) de R$ 20,00");
        System.out.println(D+ " nota(s) de R$ 10,00");
        System.out.println(E+ " nota(s) de R$ 5,00");
        System.out.println(F+ " nota(s) de R$ 2,00");
        System.out.println(G+ " nota(s) de R$ 1,00");
        
    }
    
}
