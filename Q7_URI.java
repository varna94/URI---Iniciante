
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kelly
 */
public class Q7_URI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner valor = new Scanner(System.in);
        int A = valor.nextInt();
        int B = valor.nextInt();
        int C = valor.nextInt();
        int D = valor.nextInt();
        
        int DIFERENCA = A*B - C*D;
        
        System.out.println("DIFERENCA = "+DIFERENCA);
        
        
        
        
    }
    
}
