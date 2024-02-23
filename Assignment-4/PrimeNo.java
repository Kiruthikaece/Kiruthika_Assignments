class PrimeNo {
    public static void main(String[] args) {

        for(int i=1;i<=30;i++)  
        if(findPrime(i))
        System.out.print(i+" ");
        
        
    }

    public static boolean findPrime(int n) {
        for(int i=2;i<=n/2;i++) 
        if(n%i==0) 
        return false;
        
        return true;
    }
}