import java.util.*;

class HelloWorld {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;
    System.out.println("Enter the Numbers: ");
    a = sc.nextInt();
    b = sc.nextInt();
    System.out.println(product(a,b));
  }
  
  static int product(int x, int y){
    return x*y;
  }
}
