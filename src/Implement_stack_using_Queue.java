import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Implement_stack_using_Queue {
    static Queue<Integer> Q1 = new LinkedList<>();
    static Queue<Integer> Q2 = new LinkedList<>();
    static int top;
    static int removed;

    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);
        System.out.println(Q1);

        remove();
        System.out.println(removed);
        System.out.println(top());

    }

    private static void insert(int value){
        Q1.add(value);
        top = value;
    }

    private static void remove() {
        int size = Q1.size();
        for (int i = 0; i < size - 1; i++) {
            int poll = Q1.poll();
            if (i == size - 2) {
                top = poll;
            }
            Q2.add(poll);
        }
        removed = Q1.poll();

        Q1 = Q2;
        Q2 = new LinkedList<>();
    }

    private static int top() {
        return top;
    }
}
