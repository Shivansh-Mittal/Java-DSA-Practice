package javaCore;

public class DynamicMethodDispatch {
    public static void main(String[] args) {
      Khushi obj = new Lol();
      obj.run();
      obj = new C();
      obj.run();
    }
}

class Khushi{
    void run(){
    }
}

class Lol extends Khushi{
    void run(){
        System.out.println("hello");
    }
}

class C extends Khushi{
    void run(){
        System.out.println("hiii");
    }
}
