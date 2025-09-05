import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {
        //ler 15 nomes armazenar e printar ao contrario

        Scanner sc = new Scanner(System.in);

        String[] listaNomes = new String[15];

        System.out.println("--Vamos Armazenar 15 nomes e printar eles ao contrário--");

        for (int i = 0; i < 15; i++) {
            System.out.println("Informe o " + (i + 1) + "° nome:");
            listaNomes[i] = sc.next();
        }

        System.out.println("Lista Nomes");
        for (int i = 0; i < 15; i++) {
            System.out.println((i + 1) + "° " + listaNomes[i]);
        }

        System.out.println("==================================");
        System.out.println("Nomes printados na ordem contrária");
        for (int i = 14; i >= 0; i--) {
            System.out.println((i+1) + "° " + listaNomes[i]);
        }
    }
}
