public class TryCatch {

    public static void main(String[] args) {
        try{
            int myInt = Integer.parseInt("pants");
        }
        catch (NumberFormatException nfe) {
            System.out.println("Hey dude, you cant make an int out of that. stop trying");
        }
        System.out.println("stop here");
    }
}
