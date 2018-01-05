
package q17_uri;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Q17_URI {

   
    public static void main(String[] args) {
        
        Scanner valor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        
        int HRS = valor.nextInt();
        int KM = valor.nextInt();
        
        float L = (float) (HRS * KM ) / 12;
        
        System.out.println(df.format(L));
    }
    
}
