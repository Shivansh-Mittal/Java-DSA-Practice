package javaCore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ComparableInterfacePract {
    public static void main(String[] args) {
        List<Stud> studs = new ArrayList<>();
        studs.add(new Stud(21, "Shivansh", 56));
        studs.add(new Stud(3, "Honey", 34));
        studs.add(new Stud(20, "khushi", 87));
        studs.add(new Stud(9, "lol", 43));

        Collections.sort(studs);

        for (Stud s : studs) {
            System.out.println(s);
        }
    }
}

class Stud implements Comparable<Stud>
{
    int rollno, marks;
    String name;
    public Stud(int rollno, String name, int marks)
    {
        super();
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString()
    {
        return "Stud [rollno="+rollno+", marks="+marks+", name="+name+"]";
    }
    
    public int compareTo(Stud s)
    {
        return rollno>s.rollno?1:-1;
    }
}