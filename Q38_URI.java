
package q38_uri;


import java.text.DecimalFormat;
import java.util.Scanner;


public class Q38_URI {

    
    public static void main(String[] args) {
       
        Scanner valor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        int cod = valor.nextInt();
        int qtd = valor.nextInt();
        float total = 0;
        
        float preco[] = {4.00f , 4.50f , 5.00f , 2.00f , 1.50f};
        
       
        for(int i = 0 ; i < 5 ; i++){
            
            if ( cod - 1 == i){
                
                 total = qtd * preco[i];
        
            }
         
        }
       
   System.out.println("Total: R$ " + df.format(total));
       
    }
    
}
