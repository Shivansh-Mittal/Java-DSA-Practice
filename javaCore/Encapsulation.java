package javaCore;

import java.util.Scanner;

class Student{
    private int rollNo;
    private String name;

    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student obj = new Student();

        obj.setRollNo(sc.nextInt());
        obj.setName(sc.next());

        System.out.println(obj.getRollNo()+" : "+obj.getName());
        // System.out.println();;

        sc.close();
    }
}
