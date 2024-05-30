import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
import java.util.concurrent.DelayQueue;

public class Reverse_k_elements {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);
        deque.addLast(4);
        deque.addLast(5);
        deque.addLast(6);
        deque.addLast(7);
        deque.addLast(8);
        deque.addLast(9);
        deque.addLast(10);

        int k2 = 3;

        while (k2 > 0){
            stack1.push(deque.removeFirst());
            k2--;
        }

        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        while(!stack2.isEmpty()){
            deque.addFirst(stack2.pop());
        }

        System.out.println(deque);


        // in array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Stack<Integer> stack = new Stack<>();

        int k = 3 - 1;
        int l = k;

        while (k >= 0) {
            stack.push(arr[k]);
            k--;
        }

        for (int i = l; i >= 0; i--) {
            arr[i] = stack.pop();
        }

        System.out.println(Arrays.toString(arr));
    }
}
