
import java.text.DecimalFormat;
import java.util.Scanner;


public class Q12_URI {

   
    public static void main(String[] args) {
        
        Scanner valor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.###");
        
        double A = valor.nextDouble();
        double B = valor.nextDouble();
        double C = valor.nextDouble();
        
        double resul = Math.pow(C, 2);
        double resul2 =  Math.pow(B, 2);
        
       
        
        double TRIANGULO = A * C / 2;
        double CIRCULO = 3.14159 * resul;
        double TRAPEZIO = ( (( A + B )*C) / 2);
        double QUADRADO = resul2;
        double RETANGULO = A * B;
        
        
        System.out.println("TRIANGULO: " + df.format(TRIANGULO));
        System.out.println("CIRCULO: " + df.format(CIRCULO));
        System.out.println("TRAPEZIO: " + df.format(TRAPEZIO));
        System.out.println("QUADRADO: " + df.format(QUADRADO));
        System.out.println("RETANGULO: " + df.format(RETANGULO));
        
        
        
         //área = base * altura /2
        
        // área do trapéizio = base maior + base menor * altura / 2
        
        //área do quadrado = lados²
        
        //área do retangulo= lado a* lado b
        
        
    }
    
}
