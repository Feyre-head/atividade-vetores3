import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
//        Você pega 8 números do usuário,
//        Guarda no vetor A,
//        Cria o vetor B com cada valor de A multiplicado por 3,
//        Depois mostra os números do vetor B.

        Scanner sc = new Scanner(System.in);

        int[] A = new int[8];
        int[] B = new int[8];

        System.out.println("Vamos armazenar 8 números e multiplica-los por 3 e armazenar o valor no Array B");
        for (int i = 0; i < 8; i++) {
            System.out.println("Informe o " + (i + 1) + "º Número");
            A[i] = sc.nextInt();
        }

        System.out.println("Valores de A");
        for (int i = 0; i < 8; i++) {
            System.out.println(A[i]);
        }

        //multiplicando e armazenando
        for (int i = 0; i < 8; i++) {
            B[i] = A[i] * 3;
        }


        System.out.println("Valores de B");
        for (int i = 0; i < 8; i++) {
            System.out.println(B[i]);
        }

        sc.close();
    }
}
