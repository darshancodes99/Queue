import java.util.Stack;

public class Implement_queue_using_stack {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public static void main(String[] args) {
        insertHeavy(10);
        insertHeavy(20);
        insertHeavy(30);
        insertHeavy(40);

        System.out.println(stack1);

        remove();

        System.out.println(stack1);

        System.out.println(empty());

    }

    private static void insert(int value) {
        stack1.push(value);
    }

    private static void removeHeavy() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    private static void insertHeavy(int value) {

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        stack1.push(value);

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

    }

    private static void remove() {
        stack1.pop();
    }
    public static boolean empty() {
        return stack1.isEmpty();
    }

}
