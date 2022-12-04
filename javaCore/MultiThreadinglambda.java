package javaCore;

import java.lang.Exception;
import java.util.*;

public class MultiThreadinglambda {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> 
            {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hi " + Thread.currentThread().getPriority());
                    try { Thread.sleep(1000); } catch(Exception e) { }
                }
            }, "Hi Thread");
        Thread t2 = new Thread(() -> 
            {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello");
                    try { Thread.sleep(1000); } catch(Exception e1) { }
                }
            }, "Hello Thread");

        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        
        System.out.println(t1.getPriority() + " " + t1.getName());
        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
        
        t1.start();
        try { Thread.sleep(10); } catch(Exception e2) { }
        t2.start();
    }
}
