public class Circular_Queue {
    static int front = -1, rear = -1;
    static int size = 0;

    public static void main(String[] args) {
        int[] queue = new int[5];
        enqueue(queue, 10);
        enqueue(queue, 20);
        enqueue(queue, 30);
        enqueue(queue, 40);
        enqueue(queue, 50);

        print(queue);

        dequeue(queue);
        dequeue(queue);
        dequeue(queue);

        print(queue);

        enqueue(queue, 60);
        enqueue(queue, 70);
        enqueue(queue, 80);
        enqueue(queue, 90);

        System.out.println();
        print(queue);

        System.out.println();
        System.out.println(size);
    }

    private static void enqueue(int[] queue, int value) {
        if (front == -1 && rear == queue.length - 1) {
            System.out.println("queue is full");
            return;
        }
        if (front != -1 && front == rear) {
            System.out.println("queue is full");
            return;
        }
        if (rear == queue.length - 1) {
            rear = -1;
        }
        rear++;
        queue[rear] = value;
        size++;
    }

    private static void dequeue(int[] queue) {
        if (front == -1 && rear == -1) {
            System.out.println("queue is empty");
            return;
        }
        front++;
        System.out.println(queue[front] + " deleted");
        if (front == rear) {
            front = rear = -1;
        }
        size--;
    }

    private static void print(int[] queue) {
        if (front >= rear) {
            for (int i = front + 1; i < queue.length; i++) {
                System.out.print(queue[i] + " ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
        } else {
            for (int i = front + 1; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
        }
    }

}
