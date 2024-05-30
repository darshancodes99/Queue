package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class Q_2073 {
    public static void main(String[] args) {
        int[] tickets = {2, 3, 2};
        int k = 2;
        System.out.println(timeRequiredToBuy(tickets, k));
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int total = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < tickets.length; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()){
            total++;
            int front = queue.poll();
            if (tickets[front] >= 1){
                tickets[front] -= 1;
            }

            if (k == front && tickets[k] == 0){
                break;
            }
            if (front != k && tickets[front] == 0){
                continue;
            }
            queue.add(front);
        }


        return total;
    }
}
