import java.util.Scanner;

public class PesquisaLinear {

    public static void main(String[] args) {
        int[] vetor = {90, 70, 50, 80, 60, 85};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o valor a ser pesquisado no vetor: ");
        int valor = scanner.nextInt();

        boolean validador = false;
        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] == valor) {
                System.out.println("O valor " + valor + " está no indice " + i + " do vetor.");
                validador = true;
                break;
            } else {
                validador = false;
            }

        }
        if (!validador) {
            System.out.println("O valor " + valor + " não existe no vetor.");
        }
    }
}
