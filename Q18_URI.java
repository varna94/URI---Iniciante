
package q18_uri;

import java.util.Scanner;


public class Q18_URI {

    
    public static void main(String[] args) {
      
        
        Scanner valor = new Scanner(System.in);
        
        int N = valor.nextInt();
        
        
        int A = N / 100; 
        int B = ( N % 100) / 50; 
        int C = ((N % 100) % 50) / 20;
        int D = (((N % 100) % 50) % 20) / 10; 
        int E = ((((N % 100) % 50) % 20) % 10) / 5; 
        int F = (((((N % 100) % 50) % 20) % 10) % 5) / 2;
        int G = ((((((N % 100) % 50) % 20) % 10) % 5) % 2) / 1;
        
       
        System.out.println(A+ " nota(s) de R$ 100,00");
        System.out.println(B+ " nota(s) de R$ 50,00");
        System.out.println(C+ " nota(s) de R$ 20,00");
        System.out.println(D+ " nota(s) de R$ 10,00");
        System.out.println(E+ " nota(s) de R$ 5,00");
        System.out.println(F+ " nota(s) de R$ 2,00");
        System.out.println(G+ " nota(s) de R$ 1,00");
        
      
    }
    
}
