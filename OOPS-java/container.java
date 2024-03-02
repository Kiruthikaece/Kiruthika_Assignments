class container {
    public static void main(String[] args) {
        
        bag gparent = new bag();
        gparent.open();
        box parent=new box();
        parent.istheft();
        pen child=new pen();
        child.write();
        


        //pen-child
        pen obj1=new bag();
        obj1.open();
        System.out.println(obj1.color);
        pen obj2=new box();
        obj2.close();
        //box-child
        box obj3=new bag();
        obj3.open();

//       child-pen
        bag obj4=(bag)obj1;
        obj4.open();
        box obj5=(box)obj2;
        obj5.open();
        box obj6=(bag)obj3;
        obj6.open();


        // Interface

        Inter1 i1=new box();
        i1.istheft();

        Inter2 i2=new bag();
        i2.store();
        Inter2 i3=new bag();
        i3.close();
        Inter2 i4=new bag();
        i4.cleaning();

        Inter3 i5=new pen();
        i5.write();
        Inter3 i6=new pen();
        i6.open();

        Inter4 i7=new pen();
        i7.write();

       Inter5 i8=new bag();
       i8.istheft();
       i8.store();
       
    }
}

class pen implements Inter4,Inter3 {     //gparent
    String color="red",state="write";
    double weight=100,size=100;

public void write() {
    System.out.println("pen-write");
}
public void open() {
    System.out.println("pen-open");
}
public void close() {
    System.out.println("pen-close");
}
}

class box extends pen implements Inter1  {     //parent
    String color="orange",state="istheft";
    double weight=1000,size=2000;

public  void istheft() {
    System.out.println("Box-istheft");
}
public  void open() {
    System.out.println("Box-open");
}
public  void close() {
    System.out.println("Box-close");
}

}

class bag extends box implements Inter2,Inter5{      //child
    String color="yellow",state="storage";
    double weight=40,size=900;

 
public void store() {
    System.out.println("Bag-storage");
}
public void cleaning() {
    System.out.println("Bag-cleaning");
}
public  void close() {
    System.out.println("Bag-close");
}
public void open() {
    System.out.println("Bag-open");
}
}




