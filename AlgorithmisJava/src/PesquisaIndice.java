public class PesquisaIndice {
    public static void main(String[] args) {
        int[] vetor = {1,2,3,4,5,6,7,8,9};

        search(5, vetor);
    }
    static void search(int index, int[]vetor){

        for(int i = 0; i < vetor.length; i++){
            if (index == vetor[i]){
                System.out.println("Valor " + index + " está no indice " + i + ".");
            }
        }
    }
}
