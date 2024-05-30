package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Q_933 {
   static  Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        System.out.println(ping(1));
        System.out.println(ping(100));
        System.out.println(ping(3001));
        System.out.println(ping(3002));
    }

    private static int ping(int t) {
        queue.add(t);

        while (queue.peek() < t - 3000){
            queue.poll();
        }

         return queue.size();
    }
}
