package boj2178;

import java.util.*;

// https://www.acmicpc.net/problem/2178
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] map = new int[n][m];

        scanner.nextLine();
        for(int i=0; i<n; i++) {
            String line = scanner.nextLine();
            for(int j=0; j<m; j++)
                map[i][j] = line.charAt(j) - '0';
        }

        Queue<Integer> qx = new LinkedList<>();
        Queue<Integer> qy = new LinkedList<>();
        int[][] visited = new int[n][m];

        qx.add(0);
        qy.add(0);
        visited[0][0] = 1;

        while(!qx.isEmpty() && !qy.isEmpty()) {
            int x = qx.poll();
            int y = qy.poll();

            int[][] d = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

            for (int[] ints : d) {
                int dx = x + ints[0];
                int dy = y + ints[1];

                if(dx >= 0 && dy >= 0 && dx < n && dy < m) {
                    if(map[dx][dy] == 1 && visited[dx][dy] == 0) {
                        qx.add(dx);
                        qy.add(dy);
                        visited[dx][dy] = visited[x][y] + 1;
                    }
                }
            }
        }

        System.out.println(visited[n-1][m-1]);
    }
}
