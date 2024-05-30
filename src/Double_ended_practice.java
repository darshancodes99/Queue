import java.awt.dnd.DragSource;

public class Double_ended_practice {
    static int front = -1, rear = -1;
    static int[] queue = new int[5];

    public static void main(String[] args) {
        insertLast(10);
        insertLast(20);
        insertLast(30);

        insertFirst(50);
        insertFirst(60);

        deleteFirst();
        deleteFirst();
        deleteFirst();

        deleteLast();


        insertLast(40);
        insertLast(30);


        insertFirst(50);
        insertFirst(60);
        insertFirst(70);
        insertFirst(90);
        print();
    }

    private static void insertLast(int value) {
        if (rear == queue.length - 1) {
            System.out.println("queue is full");
            return;
        }
        rear++;
        queue[rear] = value;
    }

    private static void insertFirst(int value) {
        if (front == -1 && rear == queue.length - 1) {
            System.out.println("queue is full");
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

    private static void deleteFirst() {
        if (front == rear) {
            System.out.println("queue is empty");
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
        System.out.println(queue[rear] + " deleted");
        rear--;

        if (front == rear) {
            front = rear = -1;
        }
    }

    private static void print() {
        if (front == rear) {
            System.out.println("queue is empty");
            return;
        }
        for (int i = front + 1; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
    }
}
