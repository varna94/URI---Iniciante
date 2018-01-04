
import java.text.DecimalFormat;
import java.util.Scanner;


public class Q2_URI {

    
    public static void main(String[] args) {
        
        Scanner valor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");
        
        double R = valor.nextDouble();
        
        double resul = Math.pow(R, 2);
           
        double A = 3.14159 * resul;
        
        
        System.out.println("A="+df.format(A));
        
          
      
        
        
                }
    
}
