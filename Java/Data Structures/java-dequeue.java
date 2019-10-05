import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();

        int n = in.nextInt();
        int m = in.nextInt();
        int ans = 0, distinct = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.addLast(num);

            hashmap.put(num, hashmap.getOrDefault(num, 0) + 1);

            if (hashmap.get(num) == 1)
                distinct++;

            if (deque.size() == m + 1) {
                int element = deque.removeFirst();
                hashmap.put(element, hashmap.get(element) - 1);

                if (hashmap.get(element) == 0)
                    distinct--;
            }

            if (deque.size() == m) {
                if (distinct > ans)
                    ans = distinct;
            }
        }
        System.out.println(ans);
    }
}
