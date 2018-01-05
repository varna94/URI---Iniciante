
package q19_uri;

import java.util.Scanner;


public class Q19_URI {

    
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        
        int N = valor.nextInt();
        
        int seg = N %60;
        N = N / 60;
        int min = N % 60;
        N = N /60;
        int hrs = N % 3600;
        
        
        System.out.println(hrs+":"+min+":"+seg);        
    }
    
}
