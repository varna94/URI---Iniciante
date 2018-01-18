
package q36_uri;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Q36_URI {

    
    public static void main(String[] args) {
       
        Scanner valor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.#####");
        
        double A = valor.nextDouble();
        double B = valor.nextDouble();
        double C = valor.nextDouble();
        
        
        double delta = ((Math.pow(B, 2)) - ( 4 * A * C));     
        double deltaraiz = Math.sqrt(delta);
 
     
       
        if (!(( A == 0) || (delta < 0)) ) {
            
            double R1 = (-B + deltaraiz) / (2*A);
            double R2 = (-B - deltaraiz) / (2*A);
            
             System.out.println("R1 = " +df.format(R1));
             System.out.println("R2 = " +df.format(R2));
          
            
        }else{
           System.out.println("Impossivel calcular");
        }
                             
    }
    
}
