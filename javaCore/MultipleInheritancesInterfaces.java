package javaCore;

public class MultipleInheritancesInterfaces {
    public static void main(String[] args) {
        Snakes obj = new Snakes();
        obj.eat();
        obj.breath();
        obj.slide();
    }
}

interface Reptile{
    void slide();
    default void eat(){
        System.out.println("I eat insects");
    }
}

interface LandAnimal{
    default void eat(){
        System.out.println("I eat land food");
    }
    void breath();
}

class Snakes implements Reptile, LandAnimal
{
    protected Snakes(){

    }
    public void eat(){
        Reptile.super.eat();
    }

    public void slide(){
        System.out.println("i slides");
    }

    public void breath(){
        System.out.println("i breath heavily");
    }
}