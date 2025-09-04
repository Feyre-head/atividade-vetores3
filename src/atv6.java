import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] listaInteiros = new int[10];

        System.out.println("===============================================");
        System.out.println("Adicione 10 números para saber quais sao pares");

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o " + (i + 1) + " º :");
            listaInteiros[i] = sc.nextInt();
        }

        System.out.println("====Números Pares====");
        for (int i = 0; i < 10; i++) {
            if (listaInteiros[i] % 2 == 0) {
                System.out.println(listaInteiros[i]);
            }
        }
        System.out.println("===============================================");

        sc.close();
    }
}
