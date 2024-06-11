class Printer {
    public void printDocument(String documentName) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " is printing document: " + documentName);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " finished printing document: " + documentName);
        }
    }
}

class DocumentPrinter implements Runnable {
    private Printer printer;
    private String documentName;

    public DocumentPrinter(Printer printer, String documentName) {
        this.printer = printer;
        this.documentName = documentName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {  
            printer.printDocument(documentName);
        }
    }
}

public class SynchronizedPrinter {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread thread1 = new Thread(new DocumentPrinter(printer, "Document1"), "Thread1");
        Thread thread2 = new Thread(new DocumentPrinter(printer, "Document2"), "Thread2");
        Thread thread3 = new Thread(new DocumentPrinter(printer, "Document3"), "Thread3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
