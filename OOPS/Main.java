package OOPS;

public class Main {

    public static void main(String[] args) {
        HeadPhones H = new HeadPhones();

        System.out.println(H.color);
        System.out.println(H.brand);
        System.out.println(H.price);
        H.poweroff();
        System.out.println(H.poweron());
        H.poweroff();
        System.out.println(H.poweroff());

    }



}
