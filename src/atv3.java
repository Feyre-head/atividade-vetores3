public class atv3 {
    public static void main(String[] args) {
        //manipulação direta dos elementos de um vetor

        int [] listaVetor2 = {5,10};

        System.out.println("Lista Inicial Vetor");

        for (int i = 0; i<2; i++){
            System.out.println("Index "+ (i) + ": "+ listaVetor2[i]);
        }

        listaVetor2[0] = 10;
        listaVetor2[1]= 5;

        System.out.println("Valor index alterado");
        for (int num: listaVetor2){
            System.out.println("Index " + (i));
        }


    }
}
