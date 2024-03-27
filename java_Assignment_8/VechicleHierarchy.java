class VechicleHierarchy {
    public static void main(String[] args) {

        Vechicle v1=new Train("Blue");
        v1.stage();
        Vechicle v2=new Bus("Red");
        v2.stage();
        Vechicle v3=new Bike("Green");
        v3.stage();
    }
}
abstract class Vechicle {
     String color;

    public Vechicle(String color) {
        this.color=color;
    }

    abstract void stage();
}
class Train extends Vechicle{

    public Train(String color) {
        super(color);
    }
    void stage() {
        System.out.println("Train color:"+color);
    }
}
class Bus extends Vechicle{

    public Bus(String color) {
       super(color);
    }

    void stage() {
        System.out.println("Bus color:"+color);
    }
}
class Bike extends Vechicle{

    public Bike(String color) {
        super(color);
    }

    void stage() {
        System.out.println("Bike color:"+color);
    }
}