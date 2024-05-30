import java.util.Arrays;
import java.util.Stack;

public class Test_2 {
    public static void main(String[] args) {
        int[] arr = {6, 3, 2, 4, 1};
        Stack<Integer> stack = new Stack<>();
//        for (int i = arr.length - 1; i >= 0; i--) {
//            stack.push(arr[i]);
//        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int number = arr[i];
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                arr[i] = -1;
            } else {
                arr[i] = stack.peek();
            }
            stack.push(number);
        }

        arr[arr.length - 1] = -1;

        System.out.println(Arrays.toString(arr));
    }
}
