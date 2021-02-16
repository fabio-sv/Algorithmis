public class InsercaoLinear {
    public static void main(String[] args) {

        int[] scores = {90, 70, 50, 80, 60, 85};

        scores = insert(scores, 75, 2);

        for (int i = 0; i < scores.length; i++){
            System.out.println(scores[i]);
        }
    }
    public static int[] insert(int[] array, int score, int insertIndex){
        int[] tempArray = new int[array.length + 1];

        for(int i = 0; i < array.length; i ++) {
            if (i < insertIndex) {
                tempArray[i] = array[i];
            } else {
                tempArray[i + 1] = array[i];
            }
        }
        tempArray[insertIndex] = score;

        return tempArray;
    }
}
