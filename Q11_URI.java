
import java.text.DecimalFormat;
import java.util.Scanner;


public class Q11_URI {

    
    public static void main(String[] args) {
     
        Scanner valor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.###");
        
        int R = valor.nextInt();
        double resul = Math.pow(R, 3);
        
        double VOLUME = ((4.0/3)*3.14159 * resul);
        
        
        System.out.println("VOLUME = "+ df.format(VOLUME));
        
       
        
    }
    
}
