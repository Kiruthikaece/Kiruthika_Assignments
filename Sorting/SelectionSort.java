class SelectionSort {
    public static void main(String[] args) {
        int[] arr={500,340,280,190,100};
        selectionSort(arr);
        insertionSort(arr);
        bubbleSort(arr);
    }

    public static void selectionSort(int[] arr) {


         for(int i=0;i<arr.length;i++) {
           int minElement=arr[i];
           int index=-1;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j]<minElement) {
                    minElement=arr[j];
                    index=j;
                }      
            }
            if(index!=-1) {
                int temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
            }
            
         }

         System.out.println("--- Selection Sort ----");
         for(int i=0;i<arr.length;i++)
         System.out.print(arr[i]+" ");
    }

    public static void insertionSort(int[] arr) {
        
        int partion=0;
        for(int i=partion+1;i<arr.length;i++) {
            for(int j=partion;j>=0;j--) {
                if(arr[j]>arr[i]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            partion=i;
        }


        System.out.println("\n---- Insertion Sort ----");
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");

    }

    public static void bubbleSort(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length-1;j++)
            if(arr[j]>arr[j+1]) {
                int t=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=t;
            }
        }

        System.out.println("\n----Bubble Sort----");
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }


}