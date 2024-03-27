public class MathOperation {
    public static void main(String[] args) {
        Operation operation=new Operation();
        operation.add(10.5f,10);
        operation.subtract(30,10);
        operation.multiplication(5.0f,10);
        operation.divison(10,5.0f);

    }
}

class Operation {

    public void add(int a,int b) {
       System.out.println(a+b);
    }
    public void add(int a) {
        System.out.println(a+a);
     }
     public void add(float a,int b) {
        System.out.println(a+b);
     }

    public void subtract(int a,int b) {
       System.out.println(a-b);
    }
    public void subtract(int a,float b) {
        System.out.println(a-b);
     }
     public void subtract(float a,int b) {
        System.out.println(a-b);
     }

     public void multiplication(int a,int b) {
        System.out.println(a*b);
     }
     public void multiplication(int a,float b) {
         System.out.println(a*b);
      }
      public void multiplication(float a,int b) {
         System.out.println(a*b);
      }

      public void divison(int a,int b) {
        System.out.println(a/b);
     }
     public void divison(int a,float b) {
         System.out.println(a/b);
      }
      public void divison(float a,int b) {
         System.out.println(a/b);
      }

}
