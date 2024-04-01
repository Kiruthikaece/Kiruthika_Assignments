package universityManagementSystem.University.student;

public class Student {
  private String name;
  private int id;
  private String department;

  public Student(int id,String name,String department) {
    this.id=id;
    this.name=name;
    this.department=department;
  }

public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getDepartment() {
    return department;
}
public void setDepartment(String department) {
    this.department = department;
}  
}
