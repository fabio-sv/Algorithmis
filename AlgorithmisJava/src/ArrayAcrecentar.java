public class ArrayAcrecentar {
    public static void main(String[] args) {

        int[] vetor = {90, 70, 50, 80, 60, 85};

        int[] vetorAux = new int[vetor.length + 1];

        for (int i = 0; i < vetor.length; i++){
            vetorAux[i] = vetor[i];

        }
        vetorAux[vetor.length] = 75;
        vetor = vetorAux;

        for (int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);

        }
    }
}
