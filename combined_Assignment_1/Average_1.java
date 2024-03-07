import java.util.Scanner;
class Average_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of person:");
        int n=sc.nextInt();

        float[] weight=new float[n];

        System.out.println("Enter person weights:");
        for(int i=0;i<n;i++)
        weight[i]=sc.nextFloat();

        float result=findAverage(weight);
        System.out.println(result);
    }
    public static float findAverage(float weight[]) {
        
        float s=0;
        for(int i=0;i<weight.length;i++) 
        s=s+weight[i];

        return s/weight.length;
    }
}