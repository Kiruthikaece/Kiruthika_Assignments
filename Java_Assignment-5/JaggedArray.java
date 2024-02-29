import java.util.Scanner;
class JaggedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows:");
        int n=sc.nextInt();

        int[][] jagArr=new int[n][];
       
        for(int i=0;i<n;i++) {
            System.out.println("Enter "+(i+1)+" "+"person weights count");
            int x=sc.nextInt();
            jagArr[i]=new int[x];
            System.out.println("Enter "+(i+1)+" "+"  number of weights");
            for(int j=0;j<jagArr[i].length;j++)
            jagArr[i][j]=sc.nextInt();                            
        }
       
        System.out.println("Enter the row number find minmum weight :");
        int min_weight=sc.nextInt();

        for(int i=0;i<n;i++) {
            for(int j=0;j<jagArr[i].length;j++)
           System.out.print(jagArr[i][j]+" ");   
           System.out.println();                     
        }
        int result=FindminimumWeights(jagArr,min_weight-1);
        System.out.println("Minimum weight:"+result);
    }
    public static int FindminimumWeights(int[][] jagarr,int row) {
        int min_weight=jagarr[row][0];
        for(int i=1;i<jagarr[row].length;i++) {
            if(jagarr[row][i]<min_weight)
            min_weight=jagarr[row][i];
        }

        return min_weight;
    }
}