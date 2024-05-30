public class Circular_Queue_method_2 {
    static int[] queue = new int[5];
    static int front = -1, rear = -1, size = 0;

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);

        print();

        dequeue();

        System.out.println();
        print();

        dequeue();
        dequeue();
        System.out.println();
        print();

        enqueue(60);
        enqueue(70);
        enqueue(80);
        enqueue(90);

        System.out.println();
        print();

        System.out.println();
        System.out.println("size " + size);
    }

    private static void enqueue(int value) {
        if (rear == -1) {
            front = rear = 0;
            queue[rear] = value;
        } else if (front == (rear + 1) % queue.length) {
            System.out.println("queue is  full");
            return;
        } else {
            rear = (rear + 1) % queue.length;
            queue[rear] = value;
        }
        size++;
    }

    private static void dequeue() {
        if (rear == -1) {
            System.out.println("queue is empty");
            return;
        } else if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % queue.length;
        }
        size--;
    }

    private static void print() {
        int i = front;

        while (i != rear) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % queue.length;
        }
        System.out.print(queue[i]);
    }

}
