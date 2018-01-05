
package q14_uri;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Q14_URI {

   
    public static void main(String[] args) {
       
        Scanner valor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.###");
        
       int X = valor.nextInt();
       float Y = valor.nextFloat();
       
       
       float media = X/Y;
       
        System.out.println(df.format(media)+ " km/l");
       
              
        
        
        
    }
    
}
