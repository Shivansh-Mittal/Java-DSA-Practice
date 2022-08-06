import java.util.*;

class HelloWorld {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double r;
    System.out.println("Enter the radius: ");
    r = sc.nextDouble();
    area(r);
  }
  
  static void area(double x){
      System.out.println("\n Area is "+ x*x*22/7);
      System.out.println("\n Circumference is "+ 2*x*22/7);
  }
