import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareList {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student(1,"Devi",15,"10"));
        list.add(new Student(1,"Kani",18,"12"));
        list.add(new Student(1,"Veni",10,"5"));
        list.add(new Student(1,"lakshmi",18,"12"));

        System.out.println("Before sort Student Details");
        System.out.println("Id"+" "+"Name"+" "+"Age");
        for(Student x:list)
        System.out.println(x.getId()+" "+x.getName()+" "+x.getAge());

        Collections.sort(list,new AgeComparator());

        System.out.println("Sorted Student Details");
        System.out.println("Id"+" "+"Name"+" "+"Age");
        for(Student x:list)
        System.out.println(x.getId()+" "+x.getName()+" "+x.getAge());
    }
}

class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getAge(),o2.getAge());
    }
}
class Student {
    private int id;
    private String name;
    private int age;
    private String standard;
  

    public Student(int id,String name,int age,String standard) {
        this.id=id;
        this.name=name;
        this.age=age;
        this.standard=standard;
    }

    public int getAge() {
        return age;
    }
    
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getStandard() {
        return standard;
    }
    
}
