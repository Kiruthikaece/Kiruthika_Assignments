import java.util.Scanner;
class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter rows:");
        int n=sc.nextInt();
        System.out.println("Enter columns:");
        int m=sc.nextInt();

        int[][] mat=new int[n][m];

        System.out.println("Enter Matrix:");
        for(int i=0;i<n;i++) 
        for(int j=0;j<m;j++)
        mat[i][j]=sc.nextInt();
        
        FindTranspose(mat,n,m);
    }
    public static void FindTranspose(int[][] mat,int row,int col) {
        int res[][]=new int[col][row];
        for(int i=0;i<col;i++) {
        for(int j=0;j<row;j++)
            res[i][j]=mat[j][i];
        }

        for(int[] x:res) {
        for(int y:x)
        System.out.print(y+" ");
        System.out.println();
        }
        
    }
}