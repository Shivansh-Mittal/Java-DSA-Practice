import java.util.*;

class HelloWorld {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.println("Enter the number: ");
    num = sc.nextInt();
    System.out.println(checkPrime(num)?"Prime number":"Not prime number");
  }
  
  static boolean checkPrime(int n){
      for(int i=2; i*i<n; i++){
          if(n%i==0){
            return false;
          }
      }
    return true;
  }
}
