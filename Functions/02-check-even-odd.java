import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("\n Hello, World! \n"); 
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        System.out.println(num + " is " + checkEven(num));
    }
    
    static String checkEven(int n){
        // String res = "";
        // if(n%2==0){
        //     res = "even";
        // }
        // else{
        //     res = "odd";
        // }
        return (n%2==0)? 'even': 'odd';
    }
}
