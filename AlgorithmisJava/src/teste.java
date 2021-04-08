public class teste {
    public static void main(String[] args) {
        int[] vetor = {3,2,1,-1};
        insert(vetor);
    }
    static void insert(int[] vetor){
        for(int i = 1; i < vetor.length; i ++){
            int index = i;
            int valorIndex = vetor[i];

            for(int j = 0; j < index; j++){
                int aux =  vetor[j];
                if (aux > valorIndex){
                    int temp = vetor[j];
                    vetor[j] = vetor[index];
                    vetor[index] = temp;
                }
            }


        }

        for (int l : vetor){
            System.out.println(l + ",");
        }



    }
}
