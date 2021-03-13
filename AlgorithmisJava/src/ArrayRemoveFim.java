public class ArrayRemoveFim {
    public static void main(String[] args) {

        int indexRemover = 2;

        int[] vetor = {1,2,3,4,5,6,7};
        int[] aux = new int[vetor.length - 1];

        for (int i = 0; i < vetor.length; i++){
          if (i < indexRemover){
              aux[i] = vetor[i];
          }
          if (i > indexRemover){
              aux[i - 1] = vetor[i];
          }

        }
        vetor = aux;

        for (int list : vetor){
            System.out.print(list + ", ");
        }


    }

}
