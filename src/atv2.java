public class atv2 {
    public static int soma(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        //matematica simples vetores

        int[] listaVetor = {3, 6, 9, 12};

        int soma = soma(listaVetor[0], listaVetor[3]);

        System.out.println("=======================");
        System.out.println("A soma de " + listaVetor[0] + " + " + listaVetor[3] + " é: " + soma);
        System.out.println("===========FIM=========");



    }
}
