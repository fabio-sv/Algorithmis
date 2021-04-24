public class PesquisaDicotomia {
    public static void main(String[] args) {

        int[] vetor = {50, 60, 70, 80, 90};

        dicotomia(vetor, 60);
    }
    public static void dicotomia(int[] vetor, int search){

        int meio = vetor.length / 2;

        if(search < vetor[0] || search > vetor[vetor.length - 1]){
            System.out.println("o valor " + search + " não existe no vetor.");
        }

        if(vetor[meio] > vetor[meio - 1]){
            for(int i = meio; i >= 0; i--){
                if(vetor[i] == search){
                    System.out.println("O valor " + search + " está no indice " + i);
                }
            }
        }
        if(vetor[meio] < vetor[vetor.length - 1] && vetor[meio] != search){
            for(int i = meio; i < vetor.length; i++){
                if(vetor[i] == search){
                    System.out.println("O valor " + search + " está no indice " + i);
                }
            }
        }

    }
}
