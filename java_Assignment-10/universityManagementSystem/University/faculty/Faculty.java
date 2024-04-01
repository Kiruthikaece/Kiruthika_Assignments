package universityManagementSystem.University.faculty;

public class Faculty {
    private String facultyName;
    private int id;
    private String facultyDepartment;
    private String designation;
    

    public Faculty(int id,String facultyName,String facultyDepartment,String designation) {

        this.id=id;
        this.facultyName=facultyName;
        this.facultyDepartment=facultyDepartment;
        this.designation=designation;
    }
    public String getFacultyName() {
        return facultyName;
    }
    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFacultyDepartment() {
        return facultyDepartment;
    }
    public void setFacultyDepartment(String facultyDepartment) {
        this.facultyDepartment = facultyDepartment;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }

}
