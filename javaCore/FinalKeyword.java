package javaCore;

import java.util.*;

public class FinalKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Anyone obj = new Anyone();
        obj.show(sc.nextInt());
        Giraffe obj1 = new Giraffe();
        obj1.show();
        Panda obj2 = new Panda();
        obj2.show();
        sc.close();
    }
}

class Giraffe {
    final int HEIGHT = 90;
    void show(){
        System.out.println(HEIGHT);
    }
}

class Panda {
    final void show(){
        System.out.println("is hot as fire");
    }
}

final class Anyone{
    void show(Number i){
        System.out.println(i);
    }
}
