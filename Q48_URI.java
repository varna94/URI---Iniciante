
package q48_uri;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Q48_URI {

   
    public static void main(String[] args) {
      
        Scanner valor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        float salario = valor.nextFloat();
        float n_salario;
        float acresc;
        
        
        if((salario > 0 ) && (salario <= 400.00)){
            
      
            acresc = (float) (salario * 0.15);
            n_salario = salario + acresc;
            
           
            System.out.println("Novo salario: " + df.format(n_salario));
            System.out.println("Reajuste ganho: " + df.format(acresc));
            System.out.println("Em percentual: 15 %" );
        
        }else if((salario >= 400.01 ) && (salario <= 800.00)){
            
           
            acresc = (float) (salario * 0.12);
            n_salario = salario + acresc;
            
            System.out.println("Novo salario: " + df.format(n_salario));
            System.out.println("Reajuste ganho: " +  df.format(acresc));
            System.out.println("Em percentual: 12 %" );
        
        }else if((salario >= 800.01 ) && (salario <= 1200.00)){
            
           
            acresc = (float) (salario * 0.1);
            n_salario = salario + acresc;
            
            System.out.println("Novo salario: " +df.format(n_salario));
            System.out.println("Reajuste ganho: " +  df.format(acresc));
            System.out.println("Em percentual: 10 %" );
        
        }else if((salario >= 1200.01 ) && (salario <= 2000.00)){
            
           
            acresc = (float) (salario * 0.07);
            n_salario = salario + acresc;
            
            System.out.println("Novo salario: " +df.format(n_salario));
            System.out.println("Reajuste ganho: " +  df.format(acresc));
            System.out.println("Em percentual: 7 %" );
        
        }else if((salario > 2000.00 )){
            
            
            acresc = (float) (salario * 0.04);
            n_salario = salario + acresc;
            
            System.out.println("Novo salario: " + df.format(n_salario));
            System.out.println("Reajuste ganho: " +  df.format(acresc));
            System.out.println("Em percentual: 4 %" );
        
        }
        
        
    }
    
}
