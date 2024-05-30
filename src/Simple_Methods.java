import java.util.Stack;

public class Simple_Methods {
    static int front = -1, rear = -1;

    public static void main(String[] args) {
        int[] queue = new int[5];
        // add value
        enqueue(queue, 10);
        enqueue(queue, 20);
        enqueue(queue, 30);
        enqueue(queue, 40);
        enqueue(queue, 50);
        enqueue(queue, 10);

//        print(queue);
//
//        // remove value
//        dequeue(queue);
//        dequeue(queue);
//
//        print(queue);
//
//        System.out.println();
//        System.out.println(isEmpty());
//
//        System.out.println(size());

        reverse_k_Elements(queue, 3);
        print(queue);
    }

    private static void enqueue(int[] queue, int value) {
        if (rear == queue.length - 1) {
            System.out.println("queue is full");
            return;
        }
        rear++;
        queue[rear] = value;
    }

    private static int dequeue(int[] queue) {
        if (front == rear) {
            System.out.println("queue is empty");
            return -1;
        }

        front++;
        int remove = queue[front];
        System.out.println();
        System.out.println(remove + " is removed");
        if (front == rear) {
            front = -1;
            rear = -1;
        }
        return remove;
    }

    private static void print(int[] queue) {
        for (int i = front + 1; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
    }

    private static boolean isEmpty() {
        return front == rear;
    }

    private static int size() {
        return rear - front;
    }

    public static void reverse_k_Elements(int[] queue, int k) {
        Stack<Integer> stack = new Stack<>();
        int l = k;
        while (l > 0) {
            stack.push(dequeue(queue));
            l--;
        }
        while (!stack.isEmpty()) {
            queue[k - stack.size()] = stack.pop();
            front--;
        }
    }
}
