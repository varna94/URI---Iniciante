
package q20_uri;

import java.util.Scanner;


public class Q20_URI {

    
    public static void main(String[] args) {
        
        Scanner valor = new Scanner(System.in);
        
        int N = valor.nextInt();
        
        int ANO = N / 365;
        
       // int auxano = N % 365;
        
        int MES =( N % 365)/ 30;
        
        int DIAS = (N % 365) % 30;
        
        System.out.println(ANO+" ano(s)");
        System.out.println(MES+" mes(es)");
        System.out.println(DIAS+" dia(s)");
        
        
    }
    
}
