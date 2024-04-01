package universityManagementSystem;

import universityManagementSystem.University.courses.Courses;
import universityManagementSystem.University.faculty.Faculty;
import universityManagementSystem.University.student.Student;

public class UniversityMain {
    
    public static void main(String[] args) {
        Student student=new Student(1,"keerthi","ECE");
        Faculty faculty=new Faculty(1, "priya", "ECE", "Assistant professor");
        Courses courses=new Courses(1,"BE");

        System.out.println("Name:"+student.getName());
        System.out.println("Department:"+student.getDepartment());
        System.out.println("Faculty Name:"+faculty.getFacultyName());
    }
}
