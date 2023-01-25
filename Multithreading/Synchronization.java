package Multithreading;

public class Synchronization {

    public static void main(String[] args) {
        MathService mathService = new MathService();
        MathService mathService1 = new MathService();

        Thread threadOne = new Thread(() ->
                mathService.getSumOfArray(new int[]{10, 11, 12}));
        Thread threadTwo = new Thread(() ->
                mathService.getSumOfArray(new int[]{20, 21, 22}));
        Thread threadThree = new Thread(() ->
                mathService1.getSumOfArray(new int[]{10, 11, 12}));
        Thread threadFour = new Thread(() ->
                mathService1.getSumOfArray(new int[]{20, 21, 22}));

        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();
    }
}

