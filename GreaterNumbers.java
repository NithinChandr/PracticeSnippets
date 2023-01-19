public class GreaterNumbers {

    public static int numbers(int a , int b) {
        return a +b ;
    }

    public static int highnums(int a, int b){
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        System.out.println(numbers(2,3));
        System.out.println(highnums(2, 3));

    }

}
