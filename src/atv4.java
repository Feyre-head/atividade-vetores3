import java.util.Scanner;

public class atv4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vetorStorage = new int[3];

        System.out.println("Vamos armazenar 3 números em um vetor:");
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Insira o " + (i + 1) + "º Número:");
            vetorStorage[i] = sc.nextInt();
            soma += vetorStorage[i];
        }

        System.out.println("Números Armazenados no Vetor:");
        for (int i = 0; i < 3; i++) {
            System.out.println(vetorStorage[i]);
        }

        int media = soma / 3;

        System.out.println("Soma dos Números Armazenados:" + soma);
        System.out.println("Média dos Números Armazenados:" + media);
        System.out.println("==================FIM==================");
    }
}
