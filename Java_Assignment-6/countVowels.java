import java.util.Scanner;
class countVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        str=str.toUpperCase();
        int count=0;
        for(int i=0;i<str.length();i++) 
        if(str.charAt(i)>='A' || str.charAt(i)>='E' || str.charAt(i)>='I' || str.charAt(i)>='O'||str.charAt(i)>='U')
        count++;
        
      
        System.out.println("Count the vowels:"+count);

    }
}