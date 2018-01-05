
package q15_uri;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Q15_URI {

   
    public static void main(String[] args) {
       
        Scanner valor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.####");
       
        double X1 = valor.nextDouble();
        double Y1 = valor.nextDouble();
        double X2 = valor.nextDouble();
        double Y2 = valor.nextDouble();
        
        double valor1 = Math.pow(X2 - X1, 2);
        double valor2 = Math.pow(Y2 - Y1, 2);
                
        double distance = Math.sqrt(valor1 + valor2);
        
        System.out.println(df.format(distance));
        
        
    }
    
}
