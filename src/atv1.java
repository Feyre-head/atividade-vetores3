public class atv1 {
    public static void main(String[] args) {

        //declarar, inicializar, e acessar elementos

        int[] listaNumeros = {10, 20, 30, 40, 50};

        System.out.println("====Conteúdo vetor====");
        for (int i = 0; i <5; i++){
            System.out.println(listaNumeros[i]);
        }
        System.out.println("=======================");
        System.out.println("Terceiro elemento no index 2: "+listaNumeros[2]);

    }
}
