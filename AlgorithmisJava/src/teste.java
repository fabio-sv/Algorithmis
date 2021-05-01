import java.util.Scanner;

public class teste {
    public static void main(String[] args) {

        int[] vetor = {1,2,3,4,5,6,7,8,9};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor a ser pesquisado: ");
        int valor = scanner.nextInt();

        dicotomia(valor, vetor);

    }
    public static void dicotomia(int valor, int[] vetor){
        int meio = vetor.length / 2;

        if(vetor[meio] > valor){
            for (int i = vetor[meio]; i < 0; i++){
                if(vetor[i] == valor){
                    System.out.println(i);
                }
            }
        }


    }
}
