public class ArrayQueue implements Queuable {
    private Object[] data;
    private int head;
    private int tail;

    public ArrayQueue() {
        this(10);
    }

    public void ArrayQueue(int length) {
        Object[] data = new Object[length];
        head = 0;
        tail = -1;
    }

    @Override
    public Object dequeue() {
        return null;
    }

    @Override
    public Object front() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return (head - 1 == tail);
    }

    @Override
    public boolean isFull() {
        return (tail == data.length - 1);
    }

    @Override
    public String print() {
        return null;
    }
    
}


public interface Queuable {
    void enqueue(Object data);
    Object dequeue();
    Object front();

    Boolean isEmpty();
    Boolean isFull();
    String print();
    
}