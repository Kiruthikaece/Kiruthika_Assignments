public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        
        Thread producerThread1 = new Thread(new Producer(buffer));
        Thread producerThread2 = new Thread(new Producer(buffer));
        Thread consumerThread1 = new Thread(new Consumer(buffer));
        Thread consumerThread2 = new Thread(new Consumer(buffer));
        producerThread1.start();
        producerThread2.start();
        consumerThread1.start();
        consumerThread2.start();
    }
}

class Buffer {
    private int value;
    private boolean isEmpty = true;

    public synchronized void put(int value) {
        while (!isEmpty) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.value = value;
        isEmpty = false;
        System.out.println("Produced: " + value);
        notify(); 
    }

    public synchronized int get() {
        while (isEmpty) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int retrievedValue = value;
        isEmpty = true;
        System.out.println("Consumed: " + retrievedValue);
        notify(); 
        return retrievedValue;
    }
}

class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) { 
            buffer.put(i);
            try {
                Thread.sleep((long) (Math.random() * 1000)); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) { 
            buffer.get();
            try {
                Thread.sleep((long) (Math.random() * 1000)); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

