import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("\n Hello, World! \n"); 
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter your Age: ");
        num = sc.nextInt();
        System.out.println("You are "+voting(num)+" to vote.");
    }
    
    static String voting(int n){
        String res = "";
        if(n>=18){
            res = "eligible";
        }
        else{
            res = "not eligible";
        }
        return res;
    }
}
