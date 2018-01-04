
import java.text.DecimalFormat;
import java.util.Scanner;


public class Q9_URI {

    
    public static void main(String[] args) {
        
        Scanner valor = new Scanner(System.in);
        DecimalFormat df =  new DecimalFormat("0.00");
        
        String NOME = valor.next();
        double SALARIO = valor.nextDouble();
        double VENDASMES = valor.nextDouble();
        
        double COMISSAO = VENDASMES * 0.15;
        
        double TOTAL =  SALARIO + COMISSAO;
        
        
        System.out.println("TOTAL = R$ " + df.format(TOTAL));
        
        
    }
    
}
