import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter your Age: ");
        num = sc.nextInt();
        checkEligible(num);
        // System.out.println("You are "+voting(num)+" to vote.");
    }
    
    static void checkEligible(int age){
        System.out.println((age>=18)?"Eligible to Vote":"Not Eligible to vote");
    }
    
//     static String voting(int n){
//         String res = "";
//         if(n>=18){
//             res = "eligible";
//         }
//         else{
//             res = "not eligible";
//         }
//         return res;
//     }
}
