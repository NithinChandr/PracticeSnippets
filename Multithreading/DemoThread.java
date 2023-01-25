package Multithreading;

public class DemoThread{

    public static void main(String[] args) {
        Thread demoThread1 = new Thread("demo1");
        Thread demoThread2 = new Thread("demo2");
        demoThread1.start();
        demoThread2.start();
        System.out.println("Thread names are following:");
        System.out.println(demoThread1.getName());
        System.out.println(demoThread2.getName());
    }
}

