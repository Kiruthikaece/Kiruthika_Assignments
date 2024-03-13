import java.util.Scanner;
class TrainChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.next();
        
        String result=FindTrainChar(str);
        System.out.println(result);
        sc.close();
    }
    public static String FindTrainChar(String str) {
        int n=str.length(),mid=n/2,x=mid,y=1;
        String res="";
        for(int i=0;i<n;i++) {
            if(i<mid) {
                for(int j=0;j<=x;j++)
                res=res+str.charAt(i);
                x=x-1;
            }
            else
            {
                for(int j=0;j<y;j++)
                res=res+str.charAt(i);
                y=y+1;
            }
        }
        return res;
    }
}