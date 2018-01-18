package q45_uri;

import java.util.Scanner;

public class Q45_URI {

    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);

        double A = valor.nextDouble();
        double B = valor.nextDouble();
        double C = valor.nextDouble();
        double T[] = {A, B, C};
        double aux;

        for (int i = 0; i <= 2; i++) {

            for (int j = i + 1; j <= 2; j++) {

                if (T[i] < T[j]) {

                    aux = T[i];
                    T[i] = T[j];
                    T[j] = aux;

                    A = T[0];
                    B = T[1];
                    C = T[2];
                }

            }
        }

        double A2 = Math.pow(A, 2);
        double B2 = Math.pow(B, 2);
        double C2 = Math.pow(C, 2);
        boolean condicao = true;

        if ((A >= (B + C))) {

            System.out.println("NAO FORMA TRIANGULO");

        } else {
            if (A2 == B2 + C2) {

                System.out.println("TRIANGULO RETANGULO");

            } else if (A2 > B2 + C2) {

                System.out.println("TRIANGULO OBTUSANGULO");

            } else if (A2 < B2 + C2) {

                System.out.println("TRIANGULO ACUTANGULO");

            }

            if ((A == B) && (A == C) && (B == C)) {

                System.out.println("TRIANGULO EQUILATERO");

            } else if ((A == B) || (A == C) || (B == C)) {

                System.out.println("TRIANGULO ISOSCELES");

            }
        }

    }
}
