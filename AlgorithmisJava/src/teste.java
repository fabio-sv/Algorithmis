public class teste {
    public static void main(String[] args) {
        int[] vetor = {3,2,1,-1};
        insert(vetor);
    }
    static void insert(int[] vetor){

        for(int i = 1; i < vetor.length; i++){

            for (int j = i - 1 ; j >= 0; j--){

                if(vetor[i] < vetor[j]){
                    int temp = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = temp;

                }
            }

        }
        for(int l : vetor){
            System.out.println(l);
        }





    }
}
