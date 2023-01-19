public class Arrays {

    public static float[] decs() {
        int[] numbers = new int[5];

        String[] series = new String[8];
        String[] test = new String[8];
        float[] febs = new float[6];
        float[] decs = new float[3];
        numbers[4]= 23;
        numbers[0]= 15;
        numbers[1]= 20;
        numbers[2]=21;
        numbers[3]=22;
        series[7]="goodmorning";
        series[3]="howareyou";
        series[5]="whereareyou";
        series[4]="infinite";
        return febs;
    }

    public static String[] seq(){
        String[] gap = new String[4];
        String[] finance = new String[2];
        String[] capital = new String[3];
        capital[2]= "cash";
        finance[1]= "bonds";
        return finance;

    }


    public static float[] decks(){
         float[] february = new float[5];
         february[0]= 1.1f;
         february[1]= 1.2f;
         february[2]= 1.3f;
         february[3]= 1.4f;
         february[4]= 1.5f;
         return february;
    }


    public static void main(String[] args) {
        float[] test = decks();
        for(int i=0; i<test.length; i++){
            System.out.println(test[i]);
        }

    }
}
