
package q46_uri;

import java.util.Scanner;


public class Q46_URI {

   
    public static void main(String[] args) {
        
        Scanner valor = new Scanner(System.in);
        
        int A = valor.nextInt();
        int B = valor.nextInt();
      
        if ((B > A)){
            
            System.out.println("O JOGO DUROU "+ (B - A) +" HORA(S)");
            
        }else{
            
            System.out.println("O JOGO DUROU "+ ((24-A)+B)+" HORA(S)");
        }
                
        
        
    }
    
}
