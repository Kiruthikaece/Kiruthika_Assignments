
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Job{
    private int processing_time;

    public Job(int processing_time) {
        this.processing_time=processing_time;
    }

    public int getProcessing_time() {
        return processing_time;
    }

    public void setProcessing_time(int processing_time) {
        this.processing_time = processing_time;
    }

}

class CpuScheduler {
    Queue<Job> queue=new LinkedList<>();
    int currentTime;
    int trackingWaitingTime;
    int  turnaroundTime;
    int totalProceedJob;

    public CpuScheduler() {
     currentTime=0;
     trackingWaitingTime=0;
     turnaroundTime=0;
     totalProceedJob=0;
    }

    public void addJob(Job job)  {
        queue.add(job);
    }

    public void processJobs() {
        while(!queue.isEmpty()) {
            Job currentJob= queue.poll();
            trackingWaitingTime=trackingWaitingTime+currentTime;
            turnaroundTime=turnaroundTime+currentJob.getProcessing_time();
            currentTime=currentTime+currentJob.getProcessing_time();
            totalProceedJob++;
        }
    }

    public double averageTrackingWaitingTime() {
        return trackingWaitingTime/totalProceedJob;
    }

    public double averageTurnaroundTime() {
        return turnaroundTime/totalProceedJob;
    }
    
}

public class JobSchedulingSystem {
    
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        CpuScheduler cpu=new CpuScheduler();

        System.out.println("Enter number of jobs:");
        int x=sc.nextInt();

        System.out.println("Enter jobs:");
        for(int i=0;i<x;i++) 
        cpu.addJob(new Job(sc.nextInt()));

        cpu.processJobs();

        System.out.println("Average waiting Time:"+cpu.averageTrackingWaitingTime());
        System.out.println("Average Turnaround Time:"+cpu.averageTurnaroundTime());

    }
}
