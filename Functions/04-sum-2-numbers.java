import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("\n Enter the first number: \n");
        a = sc.nextInt();
        System.out.println("\n Enter the second number: \n");
        b = sc.nextInt();
        System.out.println("Sum of "+a+" and "+b+" is: "+sum(a,b));
    }
    
    static int sum(int x, int y){
        // int res = x+y;
        return x+y;
    }
}
