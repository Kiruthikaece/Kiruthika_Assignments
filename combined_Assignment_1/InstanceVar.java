class InstanceVar {
   
    public static void main(String[] args) {

        Product in=new Product();
        System.out.println("Byte default value:"+in.a);
        System.out.println("short default value:"+in.b);
        System.out.println("int default value:"+in.c);
        System.out.println("float default value:"+in.d);
        System.out.println("char default value:"+in.e);
        System.out.println("double default value:"+in.f);
        System.out.println("boolean default value:"+in.g);
        System.out.println("long default value:"+in.h);
        System.out.println("String default value:"+in.i);
    }
}
class Product {
    byte a;
    short b;
    int c;
    float d;
    char e;
    double f;
    boolean g;
    long h;
    String i;

}