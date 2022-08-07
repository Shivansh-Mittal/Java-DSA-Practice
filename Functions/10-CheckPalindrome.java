import java.util.*;

class CheckPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number:- ");
        num = sc.nextInt();
        checkPalindrome(num);
        sc.close();
    }

    static void checkPalindrome(int n){
        int original = n;
        int reverse=0;
        int digitsCount = String.valueOf(original).length();
        for(int i=0;i<digitsCount;i++){
            reverse = 10*reverse + n%10 ;
            n = n/10;
        }
        System.out.println((original==reverse)?"Palindromic Number":"Not a Palindrome number");
    }
    
}