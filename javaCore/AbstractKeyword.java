package javaCore;

abstract class Writer {
    public abstract void show();
    public void prop(){
        System.out.println("I can write");
    }
}

class Pen extends Writer{
    public void show(){
        System.out.println("I am Pen");
    }
}

class Pencil extends Writer{
    public void show(){
        System.out.println("I am Pencil");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {
        Writer obj = new Pen();
        obj.show();
        obj.prop();

        obj = new Pencil();
        obj.show();
        obj.prop();
    }
}
