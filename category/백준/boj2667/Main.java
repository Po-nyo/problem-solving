package boj2667;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int index = 0;
    static boolean[][] visited;
    static int[] count = new int[25 * 25];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] map = new int[n][n];
        visited = new boolean[n][n];

        for(int i=0; i<n; i++) {
            String line = br.readLine();
            for(int j=0; j<n; j++)
                map[i][j] = line.charAt(j) - '0';
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(map[i][j] == 1 && !visited[i][j])
                    bfs(map, i, j);
            }
        }

        System.out.println(index);
        int[] result = Arrays.copyOf(count, index);
        Arrays.sort(result);

        for (int i : result) {
            System.out.println(i);
        }
    }

    private static void bfs(int[][] map, int x, int y) {
        Queue<Integer> xq = new LinkedList<>();
        Queue<Integer> yq = new LinkedList<>();
        xq.add(x);
        yq.add(y);
        visited[x][y] = true;

        while(!xq.isEmpty() && !yq.isEmpty()) {
            int r = xq.poll();
            int c = yq.poll();
            count[index]++;

            int[][] directions = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};

            for (int[] direction : directions) {
                int moveX = r + direction[0];
                int moveY = c + direction[1];

                if(moveX >= 0 && moveY >= 0 && moveX < map.length && moveY <map.length) {
                    if(map[moveX][moveY] == 1 && !visited[moveX][moveY]) {
                        xq.add(moveX);
                        yq.add(moveY);
                        visited[moveX][moveY] = true;
                    }
                }
            }
        }

        index++;
    }
}
