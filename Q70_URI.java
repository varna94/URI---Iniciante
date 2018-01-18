package q70_uri;

import java.util.Scanner;

public class Q70_URI {

    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);

        int X = valor.nextInt();

        for (int i = X; i <= X + 11; i++) {

            if (!(i % 2 == 0)) {

                System.out.println(i);
            }

        }

    }

}
