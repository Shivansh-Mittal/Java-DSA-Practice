import java.util.*;

class MarkToGrade {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.println("Enter the Marks: ");
    num = sc.nextInt();
    displayGrades(num);
  }
  
  static void displayGrades(int marks){
      String grade = " ";
      if(marks>=91 && marks<=100)
        grade = "AA";
      if(marks>=81 && marks<=90)
        grade = "AB";
      if(marks>=71 && marks<=80)
        grade = "BB";
      if(marks>=61 && marks<=70)
        grade = "BC";
      if(marks>=51 && marks<=60)
        grade = "CD";
      if(marks>=41 && marks<=50)
        grade = "DD";
      if(marks<=40)
        grade = "Fail";
      System.out.println(grade);
  }
}
