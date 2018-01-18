package q44_uri;

import java.util.Scanner;

public class Q44_URI {

    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);

        int A = valor.nextInt();
        int B = valor.nextInt();

        if ((A % B == 0) || (B % A == 0)) {

            System.out.println("Sao Multiplos");

        } else {
            System.out.println("Nao sao Multiplos");
        }

    }

}
