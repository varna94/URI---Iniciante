package q64_uri;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q64_URI {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        float X[] = {valor.nextFloat(), valor.nextFloat(), valor.nextFloat(), valor.nextFloat(), valor.nextFloat(), valor.nextFloat()};
        int positivos = 0;
        float media1 = 0;
        float media2;
        
        for (int i = 0; i < 6; i++) {
            if (X[i] > 0) {

                positivos = positivos + 1;
                media1 +=X[i];
            }

        }
        media2 = media1 / positivos;
        System.out.println(positivos + " valores positivos");
        System.out.println(df.format(media2));
    }
}
