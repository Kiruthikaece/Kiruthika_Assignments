import java.util.Scanner;
class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrix1 rows and columns:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int mat1[][]=new int[n1][n2];

        System.out.println("Enter matrix2 rows and columns:");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int mat2[][]=new int[m1][m2];

        for(int i=0;i<n1;i++)
        for(int j=0;j<n2;j++)
        mat1[i][j]=sc.nextInt();

        for(int i=0;i<m1;i++)
        for(int j=0;j<m2;j++)
        mat2[i][j]=sc.nextInt();

        FindMultiplication(mat1,n1,n2,mat2,m1,m2);
       
    }
    public static void FindMultiplication(int[][] mat1,int r1,int c1,int[][] mat2,int r2,int c2) {
        int[][] ans=new int[r1][c2];
        for (int i = 0; i < r1; i++) { 
            for (int j = 0; j < c2; j++) { 
                ans[i][j]=0;
                for (int k = 0; k < r2; k++) 
                    ans[i][j] += mat1[i][k] * mat2[k][j]; 
            } 
        } 
        for (int i = 0; i < r1; i++) { 
            for (int j = 0; j < c2; j++) 
                System.out.print(ans[i][j] + " "); 
  
            System.out.println(); 
        } 
    }
}