import java.util.Scanner;
class Conversion_1 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a float number:");
float f=sc.nextFloat();
System.out.println("Enter a Double number:");
double d=sc.nextDouble();
System.out.println("Enter a Int number:");
int no=sc.nextInt();
System.out.println("Enter a Long number:");
long lno=sc.nextLong();
System.out.println("Enter a int number:");
int no1=sc.nextInt();
int ans1=(int) f;
float ans2=(float) d;
short ans3=(short) no;
int ans4=(int) lno;
char ans5=(char) no1;
System.out.println("Float to Int:"+ans1);
System.out.println("Double to Float:"+ans2);
System.out.println("Int to short:"+ans3);
System.out.println("Long to Int:"+ans4);
System.out.println("Int to char:"+ans5);
}
}