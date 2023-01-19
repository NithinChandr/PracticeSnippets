package OOPS;

public class HeadPhones {

    String brand = "sennheiser";
    String color = "color";
    int price = Integer.parseInt("250");

    static boolean power = false;
    static int volume = 0;

    public static boolean poweron(){
        power=true;
        return false;
    }

    public static boolean poweroff(){
        power=true;
        return false;
    }

    public static void volumeup(){
        volume++;
    }

    public static void volumedown(){
        volume--;
    }
}

