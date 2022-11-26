package javaCore;

public class InnerClassExample {
    public static void main(String[] args) {
        Fluid obj = new Fluid();
        Fluid.Water obj1 = obj.new Water();
        Fluid.Milk obj2 = new Fluid.Milk();
    }
}

class Fluid{
    int density = 6;
    class Water{
        Water(){
            density = 10;
            System.out.println(density);
        }
    }
    static class Milk{
        Milk(){
            System.out.println("density");
        }
    }
}
