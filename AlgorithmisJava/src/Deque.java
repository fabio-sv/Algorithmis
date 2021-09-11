import javax.swing.*;
import java.util.Scanner;

public class Deque {
    public static int[] addInicio(int valor, int[] vetor) {

        if (vetor != null) {
            int[] aux = new int[vetor.length + 1];
            aux[0] = valor;

            for (int i = 0; i < vetor.length; i++) {
                aux[i + 1] = vetor[i];
            }
            vetor = aux;
        }
        return vetor;
    }

    public static int[] removeInicio(int[] vetor) {

        if (vetor != null) {
            int[] aux = new int[vetor.length - 1];

            for (int i = 0; i < vetor.length; i++) {
                if (i != 0) {
                    aux[i - 1] = vetor[i];
                }
            }
            vetor = aux;
        }

        return vetor;
    }

    public static int[] addFim(int valor, int[] vetor) {
        int[] aux = new int[vetor.length + 1];

        for (int i = 0; i < vetor.length; i++) {
            aux[i] = vetor[i];
        }
        aux[vetor.length] = valor;
        vetor = aux;

        return vetor;
    }

    public static int[] removeFim(int[] vetor) {

        if(vetor != null){
            int[] aux = new int[vetor.length - 1];

            for (int i = 0; i < aux.length; i++) {
                aux[i] = vetor[i];
            }
            vetor = aux;
        }
        return vetor;
    }

    public static void main(String[] args) {

        System.out.println("   ***************************\n" +
                "   *                         * \n" +
                "   *      LISTA CIRCULAR     *\n" +
                "   *                         * \n" +
                "   *************************** \n");

        System.out.println("Menu:\n");
        System.out.println("(1) Adicionar um novo elemento no inicio.");
        System.out.println("(2) Remover um elemento no inicio.");
        System.out.println("(3) Adicionar um novo elemento no fim.");
        System.out.println("(4) Remover elemento no fim.");
        System.out.println("(5) Finalizar\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite aqui: ");
        int escolha = scanner.nextInt();


        /**do {
            switch (escolha){
                case 1:
                    System.out.print("Valor: ");
                    int valor = 1;
                    int[] arr = valor;

            }

        }while (escolha != 5);*/








    }
}
