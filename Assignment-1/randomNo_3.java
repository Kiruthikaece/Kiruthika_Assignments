
class randomNo_3 {
    public static void main(String[] args) {
       
        int min=100000;
        int max=999999;
        int n=printRandomNo(min,max);
        System.out.println("Random number:"+n);
        
    }
   public static int printRandomNo(int min,int max) {

        int random_no=(int)(Math.random()*(max-min+1)+min);  
        return random_no;
    
   }
}