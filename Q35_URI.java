
package q35_uri;

import java.util.Scanner;


public class Q35_URI {

 
    public static void main(String[] args) {
       
        Scanner valor = new Scanner(System.in);
        
        int A = valor.nextInt();
        int B = valor.nextInt();
        int C = valor.nextInt();
        int D = valor.nextInt();
        
        if (((B > C) &&( D > A)) && ((C+D)> (A+B)) && ((C>0)&&(D>0))) {
            
            System.out.println("Valores aceitos");
            
        }else{
      
            System.out.println("Valores nao aceitos");
        
        }
        
    }
    
}
