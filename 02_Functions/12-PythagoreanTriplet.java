import java.util.*;

class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the numbers:- ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        checkTriplet(a,b,c);
        sc.close();
    }

    static void checkTriplet(int x, int y, int z){
        if( ((x*x)+(y*y)==(z*z)) || ((x*x)+(z*z)==(y*y)) || ((y*y)+(z*z)==(x*x)) )
        {
            System.out.println("True");
            return;
        }
        System.out.println("false");
        return;
    }
}