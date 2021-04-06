public class ArrayRemoveIndice {
    public static void main(String[] args) {

        int[] vetor = {1,2,3,4,5,6,7};

        remove(1, vetor);

    }

    public static void remove(int index, int[] vetor){

        int[]vetorAux = new int[vetor.length - 1];

        for(int i = 0; i < vetor.length; i++){
            if (i < index){
                vetorAux[i] = vetor[i];
            }
            if (i > index){
                vetorAux[i - 1] = vetor[i];
            }

        }

        for(int i : vetorAux){
            System.out.println(i);
        }


    }
}
