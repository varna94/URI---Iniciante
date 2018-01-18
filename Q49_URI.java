package q49_uri;

import java.util.Scanner;

public class Q49_URI {

    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);

        String P1 = valor.next();
        String P2 = valor.next();
        String P3 = valor.next();

        if ((P1.equals("vertebrado")) && (P2.equals("ave")) && (P3.equals("carnivoro"))) {

            System.out.println("aguia");

        }
        if ((P1.equals("vertebrado")) && (P2.equals("ave")) && (P3.equals("onivoro"))) {

            System.out.println("pomba");

        }
        if ((P1.equals("vertebrado")) && (P2.equals("mamifero")) && (P3.equals("onivoro"))) {

            System.out.println("homem");

        }
        if ((P1.equals("vertebrado")) && (P2.equals("mamifero")) && (P3.equals("herbivoro"))) {

            System.out.println("vaca");

        }
        if ((P1.equals("invertebrado")) && (P2.equals("inseto")) && (P3.equals("hematofago"))) {

            System.out.println("pulga");

        }
        if ((P1.equals("invertebrado")) && (P2.equals("inseto")) && (P3.equals("herbivoro"))) {

            System.out.println("lagarta");

        }
        if ((P1.equals("invertebrado")) && (P2.equals("anelideo")) && (P3.equals("hematofago"))) {

            System.out.println("sanguessuga");

        }
        if ((P1.equals("invertebrado")) && (P2.equals("anelideo")) && (P3.equals("onivoro"))) {

            System.out.println("minhoca");
        }
    }

}
