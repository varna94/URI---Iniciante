
import java.text.DecimalFormat;
import java.util.Scanner;



public class Q10_URI {

    
    public static void main(String[] args) {
        
        Scanner valor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        int codigo_p1 = valor.nextInt();
        int qtde_p1 = valor.nextInt();
        float valor_p1 = valor.nextFloat();
        
        int codigo_p2 = valor.nextInt();
        int qtde_p2 = valor.nextInt();
        float valor_p2 = valor.nextFloat();
        
        float total = ((qtde_p1*valor_p1)+(qtde_p2*valor_p2));
        
        System.out.println("VALOR A PAGAR: R$ " + df.format(total));
        
        
        
        
    }
    
}
