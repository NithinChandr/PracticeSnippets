public class IntArray {

    public static float[] decks(){
        float[] seq = new float[10];
        seq[0]= 0.5f;
        seq[1]= 0.6f;
        seq[2]= 0.7f;
        seq[3]= 0.8f;
        seq[4]= 0.9f;
        return seq;
    }

    public static void main(String[] args) {
        float[] test= decks();
        for(int i=0; i <test.length; i++){
            System.out.println(test[i]);
        }
    }

}
