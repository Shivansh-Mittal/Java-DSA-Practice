import java.util.*;

class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("Maximum of "+a+", "+b+", "+c+" is "+max(a,b,c));
        System.out.println("\n Minimum of "+a+", "+b+", "+c+" is "+min(a,b,c));
    }
    
    static int max(int x, int y, int z){
        int maximum = x;
        if(y>=maximum){
            maximum = y;
        }
        if(z>=maximum){
            maximum = z;
        }
        return maximum;
    }
    
    static int min(int x, int y, int z){
        int minimum = x;
        if(y<=minimum){
            minimum = y;
        }
        if(z<=minimum){
            minimum = z;
        }
        return minimum;
    }
}
