import java.util.*;

class Factorial {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long num;
    System.out.println("Enter the number: ");
    num = sc.nextLong();
    factorial(num);
    sc.close();
  }
  
  static void factorial(long n){
      long fact = 1;
      for(long i=n;i>1;i--){
          fact = fact*i;
      }
      System.out.println(fact);
  }
  
}
