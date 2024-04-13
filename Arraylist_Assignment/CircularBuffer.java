import java.util.ArrayList;
import java.util.List;

class CircularBuffer {
    int capacity = 5;
    List<String> list = new ArrayList<>(capacity);
    int currentIndex = 0;

    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer();
        buffer.addMessage("This is message 1");
        buffer.addMessage("This is message 2");
        buffer.addMessage("This is message 3");
        buffer.addMessage("This is message 4");
        buffer.addMessage("This is message 5");
        buffer.addMessage("This is message 6");
        buffer.printMessage();
    }

    public void addMessage(String message) {
        if (list.size() < capacity)
            list.add(message);
        else
            list.set(currentIndex++, message);
            currentIndex %= capacity;
    }

    public void printMessage() {
        for (String x : list)
            System.out.println(x);
    }
}
