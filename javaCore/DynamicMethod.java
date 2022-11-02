package javaCore;

class A1{
    public void show(){
        System.out.println("A class");
    }
}

class B1 extends A1{
    public void show(){
        System.out.println("B bacha of A");
    }
}

class C1 extends A1{
    public void show(){
        System.out.println("C bacha of A");
    }
}

class D1 extends B1{
    public void show(){
        System.out.println("D bacha of B");
    }
}

public class DynamicMethod {
    public static void main(String[] args) {
        A1 obj = new A1();
        obj.show();

        obj = new B1();
        obj.show();

        obj = new C1();
        obj.show();

        obj = new D1();
        obj.show();
    }
}
