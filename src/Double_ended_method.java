public class Double_ended_method {
    static int[] queue = new int[5];
    static int front = -1;
    static int rear = -1;

    public static void main(String[] args) {
        insertLast(10);
        insertLast(15);
        insertLast(25);

        insertFirst(6);


        insertFirst(7);
        print();
        System.out.println(rear);
        deleteFirst();
        deleteLast();
        deleteLast();
        deleteLast();
        deleteLast();
        deleteLast();
        deleteLast();
    }

    private static void insertLast(int value) {
        if (rear == queue.length - 1) {
            System.out.println("Queue is full");
            return;
        }
        rear++;
        queue[rear] = value;
    }

    private static void deleteFirst() {
        if (rear == front) {
            System.out.println("Queue is Empty");
            return;
        }
        front++;
        System.out.println(queue[front] + " deleted");
        if (front == rear) {
            front = rear = -1;
        }
    }

    private static void deleteLast() {
        if (front == rear) {
            System.out.println("queue is empty");
            return;
        }

        System.out.println(queue[rear--] + " deleted");
        if (front == rear) {
            front = rear = -1;
        }

    }

    private static void insertFirst(int value) {
        if (front == -1 && rear == queue.length - 1) {
            System.out.println("Queue is full");
            return;
        } else if (front > -1) {
            queue[front] = value;
            front--;
        } else if (front == -1 && rear < queue.length - 1) {
            rear++;
            for (int i = rear; i > 0; i--) {
                queue[i] = queue[i - 1];
            }
            queue[front + 1] = value;
        }
    }

    private static void print() {
        if (rear == -1) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = front + 1; i <= rear; ++i) {
            System.out.print(queue[i] + " ");
        }
    }
}
