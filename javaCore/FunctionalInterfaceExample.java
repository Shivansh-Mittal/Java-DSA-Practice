package javaCore;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Suck obj = () -> 
                    {
                            System.out.println("LoL");
                    };
        obj.pluck();
        obj.luck();
    }
}

@FunctionalInterface
interface Suck{
    void pluck();
    default void luck(){
        System.out.println("lucky");
    }
}
