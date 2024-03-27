import java.util.Scanner;

class GeometricShape {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter width:");
        float width=sc.nextFloat();
        System.out.println("Enter height:");
        float height=sc.nextFloat();

        Shape s2=new Rectangle(width,height);
        s2.area();
        s2.display();
        Shape s3=new Square(width);
        s3.display();
        s3.area();
        Shape s4=new Triangle(width,height);
        s4.display();
        s4.area();
        sc.close();
    }
   
}

abstract class Shape {
    float width;
    float height;
    float area;

    public Shape(float width,float height) {
        this.width=width;
        this.height=height;
    }

    abstract public void area();

    public void display() {
        System.out.println(area);
    }
}
class Rectangle extends Shape {
  
    public Rectangle(float width,float height) {
        super(width,height);
    }

    public void area() {
        area=width*height;
    }
}
class Square extends Shape {
  
    public Square(float width) {
        super(width,width);
    }

    public void area() {
        area=width*width;
    }
    
}
class Triangle extends Shape {
    
    public Triangle(float width,float height) {
        super(width,height);
    }

    public void area() {
        area=0.5f*width*height;
    }
    
}