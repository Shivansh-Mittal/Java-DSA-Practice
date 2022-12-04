package javaCore;

public class EncapsulationExample {
    public static void main(String[] args) {
        StudentInfo student = new StudentInfo();
        student.setStudent(1901780, "Khushi");
        student.getStudent();
    }
}

class StudentInfo {
    private int rollNo;
    private String name;
    void getStudent(){
        System.out.println(rollNo + " : " + name);
    }
    void setStudent(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
}
