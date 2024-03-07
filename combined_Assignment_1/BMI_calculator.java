import java.util.*;

class BMI_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Person> list=new ArrayList<>();
        System.out.println("Enter the number of persons to compare");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            System.out.println("Enter the name of person"+" "+(i+1)+":");
            String name=sc.next();
            System.out.println("Enter the weight of person"+" "+(i+1)+" in kg:");
            float weight=sc.nextFloat();
            System.out.println("Enter the height of person"+" "+(i+1)+" in cm:");
            float height=sc.nextFloat();

            float bmi=weight/((height/100)*(height/100));
            String remark;
            if(bmi<18.5)
            remark="Underweight";
            else if(bmi<25)
            remark="Normal";
            else if(bmi<30)
            remark="Overweight";
            else
            remark="Obese";

            list.add(new Person(name,remark,height,weight,bmi));
        }

           printReport(list);
       
    }

    public static void printReport(List<Person> list) {

        int i=0;
        Collections.sort(list, Comparator.comparing(b -> b.bmi));
        Collections.reverse(list);
        System.out.println("------------------------------------------------------------------");
        System.out.println("   BMI Report  ");
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-5s %-10s %-10s %-10s\n", "S.no", "Name", "BMI", "Remark");
        for (Person x : list)
        System.out.printf("%-5d %-10s %-10.2f %-10s\n", ++i, x.name, x.bmi, x.remark);
        System.out.println("-------------------------------------------------------------------");
    }
}
class Person {
    String name,remark;
    float height,weight,bmi;
    Person(String name,String remark,float height,float weight,float bmi) {
        this.name=name;
        this.remark=remark;
        this.height=height;
        this.weight=weight;
        this.bmi=bmi;
    }
    

}