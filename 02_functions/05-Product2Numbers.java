import java.util.*;

class Product2Numbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;
    System.out.println("Enter the Numbers: ");
    a = sc.nextInt();
    b = sc.nextInt();
    System.out.println(product(a,b));
    sc.close();
  }
  
  static int product(int x, int y){
    return x*y;
  }
}
