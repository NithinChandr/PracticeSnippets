import java.util.Scanner;

public class DoWhile {

    public int series(){
        return 1;
    }

    public static void main(String[] args) {
        DoWhile d = new DoWhile();
        d.series();
        Scanner s = new Scanner(System.in);

        int n;
        do {
            System.out.print("enter a number between 1 and 10: ");
            n = s.nextInt();
        } while(n < 1 || n > 10);

        System.out.println(n + " is between 1 an 10.");

    }
}
