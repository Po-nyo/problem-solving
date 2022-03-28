package boj9095;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();

        for(int i=0; i<k; i++) {
            int n = scanner.nextInt();

            Queue<String> q = new LinkedList<>();
            Map<String, Integer> visited = new HashMap<>();
            q.add("1");
            q.add("2");
            q.add("3");
            visited.put("1", 1);
            visited.put("2", 2);
            visited.put("3", 3);

            int count = 0;
            while (!q.isEmpty()) {
                String s = q.poll();

                if (visited.get(s) == n)
                    count++;

                int[] addList = {1, 2, 3};

                for (int add : addList) {
                    String key = s + add;
                    if (visited.get(s) + add <= n && !visited.containsKey(key)) {
                        q.add(key);
                        visited.put(key, visited.get(s) + add);
                    }
                }
            }

            System.out.println(count);
        }
    }
}
