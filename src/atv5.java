import java.util.Scanner;

public class atv5 {
    //Scanner para ler nomes inseridos pelo usuário e armazenar em um Vetor

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] listaNomes = new String[3];

        System.out.println("====Vamos Armazenar 3 Nomes====");
        for (int i = 0; i < 3; i++) {
            System.out.println("Insira o " + (i + 1) + " nome:");
            listaNomes[i] = sc.next();
        }

        System.out.println("======Imprimindo Nomes======");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "º nome:" + listaNomes[i]);
        }
        System.out.println("============FIM=============");

    }
}
