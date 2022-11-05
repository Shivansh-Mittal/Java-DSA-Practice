package javaCore;

public class WrapperClass {
    public static void main(String[] args) {
        int i = 5;
        Integer u = new Integer(i);
        int v = u.intValue();
        Integer w = i;
        int x = w;
        String str = "123";
        Integer y = Integer.valueOf(str);
        int z = Integer.valueOf(str);
        // hibernate & collection api work only with wrapper classes, they dont work with primitives.
    }
}
