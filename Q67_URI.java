package q67_uri;

import java.util.Scanner;

public class Q67_URI {

    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);

        int X = valor.nextInt();

        for (int i = 1; i <= X; i++) {

            if (!(i % 2 == 0)) {

                System.out.println(i);

            }

        }

    }

}
