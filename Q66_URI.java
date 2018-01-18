package q66_uri;

import java.util.Scanner;

public class Q66_URI {

    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);

        float X[] = {valor.nextFloat(), valor.nextFloat(), valor.nextFloat(), valor.nextFloat(), valor.nextFloat()};
        int positivos = 0;
        int negativos = 0;
        int par = 0;
        int impar = 0;

        for (int i = 0; i < 5; i++) {

            if (X[i] > 0) {

                positivos += 1;

            } else {
                    
                negativos += 1;
                
                if(X[i]==0){
                    
                    negativos = negativos -1;
                }
            }
            if (X[i] % 2 == 0) {

                par += 1;

            } else {

                impar += 1;
            }

        }
        System.out.println(par+ " valor(es) par(es)");
        System.out.println(impar+ " valor(es) impar(es)");
        System.out.println(positivos+ " valor(es) positivo(s)");
        System.out.println(negativos+" valor(es) negativo(s)");
    }

}
