package LeetCode;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

public class Q_1700 {
    public static void main(String[] args) {
        int[] students = {1, 1, 1, 0, 0, 1};
        int[] sandwiches = {1, 0, 0, 0, 1, 1};
        System.out.println(countStudents(students, sandwiches));
    }

    public static int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < sandwiches.length; i++) {
            queue.add(students[i]);
            stack.push(sandwiches[sandwiches.length - i - 1]);
        }


        int count = 0;
        while (!stack.isEmpty()) {
            if (Objects.equals(queue.peek(), stack.peek())) {
                queue.poll();
                stack.pop();
                count = 0;
            } else {
                int add = queue.poll();
                queue.add(add);
                count++;
            }

            if (count == queue.size()) {
                break;
            }
        }

        return queue.size();
    }
}
