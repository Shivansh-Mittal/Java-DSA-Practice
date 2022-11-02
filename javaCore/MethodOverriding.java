package javaCore;

class A{
    public void show(){
        System.out.println("A class");
    }
}

class B extends A{
    @Override
    public void show(){
        System.out.println("B class");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
