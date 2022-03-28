package boj1697;

import java.util.*;

// https://www.acmicpc.net/problem/1697
// bfs
public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] visited = new int[100001];

        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        visited[n] = 1;

        while(!q.isEmpty()) {
            int pos = q.poll();

            if (pos == k)
                break;

            if (pos + 1 <= 100000 && visited[pos + 1] == 0) {
                q.add(pos + 1);
                visited[pos + 1] = visited[pos] + 1;
            }
            if (pos - 1 >= 0 && visited[pos - 1] == 0) {
                q.add(pos - 1);
                visited[pos - 1] = visited[pos] + 1;
            }
            if (pos * 2 <= 100000 && visited[pos * 2] == 0) {
                q.add(pos * 2);
                visited[pos * 2] = visited[pos] + 1;
            }
        }

        System.out.println(visited[k] - 1);
    }
}
