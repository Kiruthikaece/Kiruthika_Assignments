import java.util.Scanner;
class SpiralOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrix1 rows and columns:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        int mat[][]=new int[n1][n2];

       
        for(int i=0;i<n1;i++)
        for(int j=0;j<n2;j++)
        mat[i][j]=sc.nextInt();
        Spiralorder(mat,n1,n2);
       
    }
    public static void Spiralorder(int[][] mat,int row,int col) {
        int i,l=0,leftt=0;
        while(leftt<row && l<col) {
            for(i=leftt;i<col;i++)
            System.out.print(mat[leftt][i]+" ");
            leftt++;
            for(i=leftt;i<row;i++)
            System.out.print(mat[i][col-1]+" ");
            col--;
            if(leftt<row)
            for(i=col-1;i>=l;i--)
            System.out.print(mat[row-1][i]+" ");
            row--;
            if(l<col)
            for(i=row-1;i>=leftt;i--)
            System.out.print(mat[i][l]+" ");
            l++;
        }
        

    }
}