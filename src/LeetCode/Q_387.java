package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class Q_387 {
    public static void main(String[] args) {
        String s = "aabb";
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == 1) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);

        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        Queue<Character> queue = new LinkedList<>();
        Queue<Integer> indexes = new LinkedList<>();

        int[] charCounts = new int[26];

        for (char c : s.toCharArray()) {
            int index = c - 'a';
            charCounts[index]++;
            if (charCounts[index] == 1) {
                queue.add(c);
                indexes.add(s.indexOf(c));
            } else {
                while (!queue.isEmpty() && charCounts[queue.peek() - 'a'] > 1) {
                    queue.poll();
                    indexes.poll();
                }
            }
        }

        if (queue.isEmpty()) {
            return -1;
        }

        return indexes.peek();
    }
}
