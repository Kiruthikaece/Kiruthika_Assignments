import java.util.ArrayList;
import java.util.List;

public class RandonSequentialAccess {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Random Access
        long startTime_r=System.nanoTime();
        for(int i=0;i<list.size();i++)
        list.get(i);
        long endTime_r=System.nanoTime();
        long randomTimeComplexity=endTime_r-startTime_r;

        // sequentiql access
        long startTime_s=System.nanoTime();
        for(Integer l:list)
        {

        }
        long endTime_s=System.nanoTime();
        long sequentialTimeComplexity=endTime_s-startTime_s;

        System.out.println("random time complexity:"+randomTimeComplexity);
        System.out.println("sequential Time Complexity"+sequentialTimeComplexity);
        
        if(randomTimeComplexity<sequentialTimeComplexity)
        System.out.println("random access is less time complexity");
        else
        System.out.println("sequential access is less time complexity");

        
    }
}
