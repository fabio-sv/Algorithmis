public class ArrayInsereFim {
    public static void main(String[] args) {

        //cria um vetor
        int[] vetor = {90, 70, 50, 80, 60, 85};

        //cria vetor auxiliar, que recebe o vetor principal com uma posição a mais
        int[] vetorAux = new int[vetor.length + 1];

        //adiciona o vetor principal no vetor auxiliar
        for (int i = 0; i < vetor.length; i++) {
            vetorAux[i] = vetor[i];

        }
        //adiciona um valor ao novo indice
        vetorAux[vetor.length] = 75;
        vetor = vetorAux;

        //imprime o array com o novo indice adicionado
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + ", ");

            //saida: 90, 70, 50, 80, 60, 85, 75,

        }
    }
}
