package javaCore;

public class InheritanceExample {
    public static void main(String[] args) {
        Lion obj = new Lion();
        obj.sound();
    }
}

class Animal{
    public Animal(){
        System.out.println("I am constructor of Animal");
    }

    void sound(){
        System.out.println("I make a lot of kind of noises");
    }
}

class Cat extends Animal {
    public Cat(){
        System.out.println("I am constructor of Cat");
    }

    void sound(){
        super.sound();
        System.out.println("I do meow sound");
    }
}

class Lion extends Cat{
    public Lion(){
        System.out.println("I am constructor of lion");
    }

    void sound(){
        super.sound();
        System.out.println("I do roar sound");
    }
}
