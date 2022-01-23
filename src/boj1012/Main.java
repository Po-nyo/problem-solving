package boj1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1012
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for(int i=0; i<testCase; i++) {
            String[] inputs = br.readLine().split(" ");
            int m = Integer.parseInt(inputs[0]);
            int n = Integer.parseInt(inputs[1]);
            int k = Integer.parseInt(inputs[2]);

            int[][] map = new int[m][n];

            for(int j=0; j<k; j++) {
                inputs = br.readLine().split(" ");
                map[Integer.parseInt(inputs[0])][Integer.parseInt(inputs[1])] = 1;
            }

            int count = 0;

            for(int row=0; row<map.length; row++) {
                for(int col=0; col<map[row].length; col++) {
                    if(map[row][col] == 1) {
                        dfs(map, row, col);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    public static void dfs(int[][] map, int row, int col) {
        map[row][col] = 0;

        int[][] directions = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

        for (int[] direction : directions) {
            int moveRow = row + direction[0];
            int moveCol = col + direction[1];

            if(moveRow >= 0 && moveRow < map.length && moveCol >=0 && moveCol < map[0].length) {
                if(map[moveRow][moveCol] == 1)
                    dfs(map, moveRow, moveCol);
            }
        }
    }
}
