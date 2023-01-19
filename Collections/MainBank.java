package Collections;

import java.util.ArrayList;
import java.util.List;

public class MainBank {

    public static void main(String[] args) {
        List<Bank> bankList = new ArrayList<>();
        Bank b1 =  new Bank("3453","peter","23456");
        Bank b2 = new Bank("7645","virat","12ewe");
        Bank b3 = new Bank("4562","stuart","13414");
        Bank b4 = new Bank("1232","white","3314");
        Bank b5 = new Bank("5642","ponting","564674");

        bankList.add(b1);
        bankList.add(b2);
        bankList.add(b3);
        bankList.add(b4);
        bankList.add(b5);

        for(int i = 0; i < bankList.size();i++){
            System.out.println(bankList.get(i));
        }

    }
}
