
class SimulateDeadLock {
    public static void main(String[] args) {
        ResourceA resourceA = new ResourceA();
        ResourceB resourceB = new ResourceB();

        Thread thread1 = new Thread(() -> { resourceA.methodA(resourceB);
        }, 
        "Thread-1");
       Thread thread2 = new Thread(() -> { resourceB.methodB(resourceA);
        },
         "Thread-2");
        thread1.start();
        thread2.start();
    }
}

 class ResourceA{
    public void methodA(ResourceB resourceB) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " acquired lock on ResourceA");

            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (resourceB) {
                System.out.println(Thread.currentThread().getName() + " acquired lock on ResourceB");
            }
        }
    } 
}


 class ResourceB {
    public void methodB(ResourceA resourceA) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " acquired lock on ResourceB");

            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (resourceA) {
                System.out.println(Thread.currentThread().getName() + " acquired lock on ResourceA");
            }
        }
    }
}