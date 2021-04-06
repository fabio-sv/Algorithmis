public class teste {
    public static void main(String[] args) {

        int[] valores  = {1,2,3,4,5,6,7,8};

        valores = remove(0, valores);

        for(int list : valores){
            System.out.println(list);
        }
    }

    static int[] remove(int index, int[] vetor){

        int[] temp = new int[vetor.length - 1];

        for(int i = 0; i < vetor.length; i ++){
            if(i < index){
                temp[i] = vetor[i];
            }
            if(i > index){
                temp[i - 1] = vetor[i];
            }
        }
        vetor = temp;

        return vetor;
    }
}
