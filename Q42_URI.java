package q42_uri;

    import java.util.Scanner;

public class Q42_URI {

    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);
        int aux;
        int A[] = {valor.nextInt(), valor.nextInt(), valor.nextInt()};
        int B = A[0];
        int C = A[1];
        int D = A[2];

        for (int i = 0; i <= 2; i++) {

            for (int j = i+1; j <= 2; j++) {

                if (A[i] > A[j]) {

                    aux = A[i];
                    A[i] = A[j];
                    A[j] = aux;

                }

            }
        }
        
        for (int k = 0; k <= 2; k++) {

            System.out.println(A[k]);

        }
        System.out.println("");
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);


    }

}
