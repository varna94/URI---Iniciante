
import java.text.DecimalFormat;
import java.util.Scanner;
import sun.security.krb5.internal.rcache.DflCache;


public class Q8_URI {

    
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        
        DecimalFormat df =  new DecimalFormat("0.00");
        int NUMBER = valor.nextInt();
        int HORAS = valor.nextInt();
        float SALARIO = valor.nextFloat();
        
        float SALARY = SALARIO *  HORAS;
        
        System.out.println("NUMBER = "+NUMBER );
        System.out.println("SALARY = U$ "+ df.format(SALARY));
        
        
        
    }
    
}
