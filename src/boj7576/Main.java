package boj7576;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);

        int[][] box = new int[n][m];
        int[][] visited = new int[n][m];

        for(int i=0; i<n; i++) {
            input = br.readLine().split(" ");
            for(int j=0; j<m; j++)
                box[i][j] = Integer.parseInt(input[j]);
        }

        Queue<Point> q = new LinkedList<>();

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(box[i][j] == 1)
                    q.add(new Point(i, j));
            }
        }

        while(!q.isEmpty()) {
            Point p = q.poll();

            int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

            for (int[] direction : directions) {
                int x = p.x + direction[0];
                int y = p.y + direction[1];

                if(x >= 0 && y >= 0 && x < n && y < m) {
                    if(box[x][y] == 0 && visited[x][y] == 0) {
                        q.add(new Point(x, y));
                        box[x][y] = 1;
                        visited[x][y] = visited[p.x][p.y] + 1;
                    }
                }
            }
        }

        int answer = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(box[i][j] == 0) {
                    System.out.println("-1");
                    return;
                }
                answer = Math.max(answer, visited[i][j]);
            }
        }

        System.out.println(answer);
    }
}
