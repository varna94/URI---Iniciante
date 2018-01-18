
package q65_uri;

import java.util.Scanner;


public class Q65_URI {

    
    public static void main(String[] args) {
          
        Scanner valor = new Scanner(System.in);
        
         float X[] = {valor.nextFloat(), valor.nextFloat(), valor.nextFloat(), valor.nextFloat(), valor.nextFloat()};
         int par = 0;
       
        for(int i = 0; i<5 ; i++){
            if(X[i] % 2 == 0){
                
                par = par +1;
                
            }
            
            
        }
        System.out.println(par + " valores pares");
    }
    
    
}
