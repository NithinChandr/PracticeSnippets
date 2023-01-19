import java.sql.SQLOutput;

public class StringArrays {

    public static String[] countries(){
        String[] india = new String[5];
        String[] america = new String[4];
        String[] australia = new String[3];
        india[0]= "telangana";
        india[1]="Maharastra";
        india[2]="punjab";
        america[0]="Arizona";
        america[1]="Florida";
        america[2]="Oklahoma";
        australia[0]="Melbourne";
        australia[1]="Canberra";
        australia[2]="newsouthwales";
        return india;
    }

    public static void main(String[] args) {
        String[] test= countries();
        for(int i=0; i<test.length; i++){
            System.out.println(test[i]);
        }
    }
}
