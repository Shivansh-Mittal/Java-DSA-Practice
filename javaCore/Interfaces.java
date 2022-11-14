package javaCore;

abstract class Writer{

}

@FunctionalInterface
interface InkWriting{
    void show();
    // static int i;
    default void write(){
        System.out.println("Anything can happen");
    }
}

class Pen extends Writer implements InkWriting{
    public void show(){
        System.out.println();
    }
    
    public void write(){
        System.out.println("Seriously");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Writer obj = new Pen();
        // obj.show();

        InkWriting obj1 = new Pen();
        obj1.show();

        InkWriting obj2 = new InkWriting()
                            {
                                public void show()
                                {
                                    System.out.println("anony class");
                                }
                            };
        obj2.show();
        obj2.write();

        InkWriting obj3 = () -> System.out.println("functional interface with lambda expression");
        obj3.show();
        obj3.write();
    }
}
