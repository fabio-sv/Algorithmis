public class InsertSort {
    public static void main(String[] args) {

        int[] scores = {80, 70, 60, 50, 95};

        insertSort(scores);

    }

    public static void insertSort(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int indexInsert = i;

            for (int j = 0; j < indexInsert; j++) {

                if (vetor[j] > vetor[i]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[indexInsert];
                    vetor[indexInsert] = temp;
                }
            }

        }

        for (int l : vetor) {
            System.out.println(l + ",");
        }

    }
}
