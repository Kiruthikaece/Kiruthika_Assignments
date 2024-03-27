public class VechicleHierarchy {
    public static void main(String[] args) {

        Vechicle vechicle1=new Train();
        vechicle1.start();
        vechicle1.stop();

        Vechicle vechicle2=new Bus();
        vechicle2.start();
        vechicle2.stop();

        Vechicle vechicle3=new Car();
        vechicle3.start();
        vechicle3.stop();
    }
}
abstract class Vechicle {
    abstract public void start();
    abstract public void stop();
}
class Train extends Vechicle{
    public void start() {
        System.out.println("Train start");
    }
    public void stop() {
        System.out.println("Train stop");
    }
}
class Bus extends Vechicle{
    public void start() {
        System.out.println("Bus start");
    }
    public void stop() {
        System.out.println("Bus stop");
    }
}
class Car extends Vechicle{
    public void start() {
        System.out.println("car start");
    }
    public void stop() {
        System.out.println("car stop");
    }
}