//Código está funcionando, no entanto não foi aceito na submissão do site URI.
//Resolver futuramente..

import java.text.DecimalFormat;
import java.util.Scanner;


public class Q5_URI {

    
    public static void main(String[] args) {
        
        Scanner valor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.#####");
        
        double A = valor.nextDouble() * 3.5;
        double B = valor.nextDouble() * 7.5;
        
        double MEDIA = (A + B) / 11;
        
       
        System.out.println("MEDIA = "+df.format(MEDIA));
        
    }
    
}
