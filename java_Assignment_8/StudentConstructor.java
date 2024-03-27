class StudentConstructor {
    public static void main(String[] args) {

        ZsgsStudent obj1=new ZsgsStudent("keerthi","keerthi@gmail.com","9876543211","BE","vgs");
        obj1.printDetails();
    }
}
class Student {

private String name;
private String email;
private String phoneNo;
Student() {

}
Student(String name,String email,String phoneNo) {
    this.name=name;
    this.email=email;
    this.phoneNo=phoneNo;
}
public void printDetails() {
    System.out.println("Name:"+name);
    System.out.println("Email:"+email);
    System.out.println("Phone Number:"+phoneNo);
    
}
}


class ZsgsStudent extends Student {
private String degree;
private String schoolName;
ZsgsStudent(String name,String email,String phoneNo,String degree,String schoolName) {
super(name,degree,email);
this.degree=degree;
this.schoolName=schoolName;
}

public void printDetails() {
    super.printDetails();
    System.out.println("Degree:"+degree);
    System.out.println("School Name:"+schoolName);
    
}
}