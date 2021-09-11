import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = new int[3];

        arr[0] = 3;
        arr[1] = 2;
        arr[2] = 1;


       /* Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }*/

        quickSort(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void quickSort(int[] arr, int inicio, int fim) {

        //verifica se o vetor é valido
        if (inicio > fim) {
            return;
        }
        int i = inicio;
        int j = fim;
        int base = arr[inicio];

        while (i < j) {
            //
            while (i < j && arr[j] > base) {
                j--;
            }

            if (i < j) {
                arr[i++] = arr[j];
            }

            while (i < j && arr[i] <= base) {
                i++;
            }

            if (i < j) {
                arr[j--] = arr[i];
            }
        }
        arr[i] = base;

        quickSort(arr, inicio, i - 1);
        quickSort(arr, i + 1, fim);

    }

    public static void quickSort(int[] arr) {
        if (arr.length > 0) {
            quickSort(arr, 0, arr.length - 1);
        }
    }
}