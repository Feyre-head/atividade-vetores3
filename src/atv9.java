import java.util.Scanner;

public class atv9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //vetor para armazenar modelo de 5 carros
        String[] modeloCarros = new String[5];
        //vetor armazenar consumo quilômetros por litro
        int[] consumoKmLitro = new int[5];

        System.out.println("Vamos Avaliar a eficiência de 5 Carros:");

        //Armazena nomes dos carros
        for (int i = 0; i < 5 ; i++){
            System.out.println("Informe o nome de 5 Carros: ");
            modeloCarros[i] = sc.nextLine();

            for(int c = 0; c <5 ; c++){
                System.out.println("Informe quantos Km o carro faz por Litro: ");
                consumoKmLitro[c] = sc.nextInt();
            }
        }



        //Mostrar qual carro é o mais econômico (maior valor em km/L).
        //Calcular quantos litros cada carro gastaria para percorrer uma distância (exemplo: 1.000 km).
        //Comparar os carros em termos de eficiência.
    }
}
