import java.util.Scanner;

class HierarchyShape {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter base:");
        float base=sc.nextFloat();
        System.out.println("Enter height:");
        float height=sc.nextFloat();
        System.out.println("Enter side of square:");
        float side=sc.nextFloat();
        System.out.println("Enter radius of circle:");
        float radius=sc.nextFloat();

        Shape s1=new Rectangle(base,height);
        System.out.println(s1.area());
        System.out.println(s1.perimeter());
    
        Shape s2=new Square(side);
        System.out.println(s2.area());
        System.out.println(s2.perimeter());
        Shape s3=new Circle(radius);
        System.out.println(s3.area());
        System.out.println(s3.perimeter());

        sc.close();

    }
}
abstract class Shape {

    abstract public float area();
    abstract public float perimeter();
}
class Rectangle extends Shape {
    float base;
    float height;

    Rectangle( float base, float height) {
        this.base=base;
        this.height=height;
    }
    public float area() {
        return base*height;
    }
    public float perimeter() {
        return 2*(base+height);
    }
}
class Square extends Shape {
    float side;

    Square(float side) {
        this.side=side;
    }

    public float area() {
        return side*side;
    }
    public float perimeter() {
        return 4*side;
    }
    
}
class Circle extends Shape {
    float radius;

    Circle(float radius) {
        this.radius=radius;
    }
    public float area() {
        return 3.14f*radius*radius;
    }
    public float perimeter() {
        return 2*3.14f*radius;
    }
    
}
