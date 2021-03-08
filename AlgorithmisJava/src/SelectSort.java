public class SelectSort {
    public static void main(String[] args) {

        int[] vetor = {28, 48, 54, 87, 24, 85};

        select(vetor);

        for (int i : vetor) {
            System.out.println(i);
        }

    }

    public static void select(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int indexMin = i;

            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[indexMin] > vetor[j]) {
                    indexMin = j;
                }
            }

            if (i != indexMin) {
                int temp = vetor[i];
                vetor[i] = vetor[indexMin];
                vetor[indexMin] = temp;
            }
        }

    }
}
