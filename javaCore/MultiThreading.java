import java.util.*;
import java.lang.Exception;

public class MultiThreading {
    public static void main(String[] args) {
        Thread T1 = new MyThread();
        Thread T2 = new Hi();
        Thread T3 = new Hello();
        // T1.run();
        T1.start();
        T2.start();
        try { Thread.sleep(10); } catch(Exception e) { }
        T3.start();
    }
}

class MyThread extends Thread{
    int[] values = {0,2,4,6,8};
    public void run(){
        for (int i = 0; i < values.length; i++) {
            values[i] = values[i]*2;
        }
        System.out.println(Arrays.toString(values));
    }
}

class Hi extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try { Thread.sleep(1000); } catch(Exception e) { }
        }
    }
}

class Hello extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try { Thread.sleep(1001); } catch(Exception e) { }
        }
    }
}
