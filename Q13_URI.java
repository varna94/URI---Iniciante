
 
package q13_uri;

import static java.lang.Math.abs;
import java.util.Scanner;


public class Q13_URI {

    
    public static void main(String[] args) {
       
        Scanner valor = new Scanner(System.in);
        
        int A = valor.nextInt();
        int B = valor.nextInt();
        int C = valor.nextInt();
        
        int MAIORAB = ( A + B +  abs((A-B)))/2;
        
        int MAIOR = (MAIORAB + C + abs ((MAIORAB - C)))/2;
        
        System.out.println(MAIOR + " eh o maior");
        
        
        
    }
    
}
