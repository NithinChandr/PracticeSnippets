public class FlowControl {

    public static void main(String[] args) {
        int x = 20;
        int y = 40;
        int z = 60;

        if (x+y == 40) {
            System.out.println("the value of x+y is 40");
        } else if(x+y == 50) {
            System.out.println("the value of y is 50");
        }
        else if(x+y == 80) {
            System.out.println("x+y is z");
            System.out.println("the value of x+y is 60");
        }
        else {
            System.out.println("the condition is not met");
        }
    }
}


