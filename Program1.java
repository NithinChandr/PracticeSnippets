public class Program1 {

    public static void main(String[] args) {
        int a = 7;
        int b = 0;
        try {
             int c= a/b ;
        }
        catch(ArithmeticException e) {
            System.out.println("zero cannot be divided by any number");
        }

    }
}
