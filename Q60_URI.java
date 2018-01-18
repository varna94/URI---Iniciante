package q60_uri;

import java.util.Scanner;

public class Q60_URI {

    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);

        float X[] = {valor.nextFloat(), valor.nextFloat(), valor.nextFloat(), valor.nextFloat(), valor.nextFloat(), valor.nextFloat()};
        int positivos = 0;

        for (int i = 0; i < 6; i++) {
            if (X[i] > 0) {

                positivos = positivos + 1;

            }

        }
        System.out.println(positivos + " valores positivos");
    }

}
