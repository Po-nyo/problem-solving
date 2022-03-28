package boj7569;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// https://www.acmicpc.net/problem/7569
public class Main {

    static int[][][] visited;
    static int[][][] box;
    static int m;
    static int n;
    static int h;

    static class Point {
        int x;
        int y;
        int z;

        Point(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] mnh = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        m = mnh[0];
        n = mnh[1];
        h = mnh[2];

        box = new int[h][n][m];

        for(int z=0; z<h; z++) {
            for(int x=0; x<n; x++) {
                box[z][x] = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt).toArray();
            }
        }

        visited = new int[h][n][m];
        Queue<Point> q = new LinkedList<>();

        for(int z=0; z<h; z++) {
            for(int x=0; x<n; x++) {
                for(int y=0; y<m; y++) {
                    if(box[z][x][y] == 1) {
                        q.add(new Point(x, y, z));
                    }
                }
            }
        }

        bfs(q);
        int answer = 0;

        for(int z=0; z<h; z++) {
            for(int x=0; x<n; x++) {
                for(int y=0; y<m; y++) {
                    answer = Math.max(answer, visited[z][x][y]);
                    if(box[z][x][y] == 0) {
                        System.out.println("-1");
                        return;
                    }
                }
            }
        }

        System.out.println(answer);
    }

    public static void bfs(Queue<Point> q) {
        while(!q.isEmpty()) {
            Point p = q.poll();

            int[][] directions = {
                    {-1, 0, 0}, {1, 0, 0}, {0, 1, 0}, {0, -1, 0}, {0, 0, 1}, {0, 0, -1}
            };

            for (int[] direction : directions) {
                int x = p.x + direction[0];
                int y = p.y + direction[1];
                int z = p.z + direction[2];

                if(x >= 0 && y >= 0 && z >= 0 && x < n && y < m && z < h) {
                    if(box[z][x][y] == 0 && visited[z][x][y] == 0) {
                        visited[z][x][y] = visited[p.z][p.x][p.y] + 1;
                        box[z][x][y] = 1;
                        q.add(new Point(x, y, z));
                    }
                }
            }
        }
    }
}
