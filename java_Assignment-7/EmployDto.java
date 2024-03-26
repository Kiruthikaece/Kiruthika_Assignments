import java.util.Scanner;

class EmployDto{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Employ employ=new Employ();

        System.out.println("Enter employ name:");
        employ.setName(sc.next());
        System.out.println("Enter employ Designation:");
        employ.setDesignation(sc.next());
        System.out.println("Enter employ experience:");
        employ.setExperience(sc.nextInt());
        System.out.println("Enter employ age:");
        employ.setAge(sc.nextInt());


        System.out.println("--------------------------------------");
        System.out.println("    Employ Details    ");
        System.out.println("--------------------------------------");
        System.out.println("Company Name:"+employ.getCompanyName());
        System.out.println("Employ Name:"+employ.getName());
        System.out.println("Employ Designation:"+employ.getDesignation());
        System.out.println("Employ Experience:"+employ.getExperience());
        System.out.println("Employ age:"+employ.getAge());
        System.out.println("--------------------------------------");

        sc.close();
    }
}
class Employ {
        private String name;
        private String Designation;
        private int experience;
        private int age;
        private static String companyName="ZSGS";

       

        public String getCompanyName() {
            return companyName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDesignation() {
            return Designation;
        }

        public void setDesignation(String designation) {
            Designation = designation;
        }

        public int getExperience() {
            return experience;
        }

        public void setExperience(int experience) {
            this.experience = experience;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

       
        
       
}
