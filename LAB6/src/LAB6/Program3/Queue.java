package LAB6.Program3;

public class Queue {
    private int[] elements;
    private int size = 0;

    Queue() 
    {
        this.elements = new int[8];
    }

    Queue(int size) 
    {
        this.elements = new int[size];
    }
    
    public void enqueue(int v) {
        if (size == elements.length) 
        {
            int[] tmp = new int[elements.length * 2];
            System.arraycopy(elements, 0, tmp, 0, elements.length);
            elements = tmp;
        }
        elements[size] = v;
        size++;
    }

    public int dequeue() {
        int tmp = this.elements[0];
        for (int i = 0; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;
        return tmp;
    }

    public boolean empty() {
        return (this.size == 0);
    }

    public int getSize() {
        return this.size;
    }
}
