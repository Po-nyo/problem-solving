package boj1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1018
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);

        char[][] board = new char[n][m];
        int answer = n*m;

        for(int i=0; i<n; i++)
            board[i] = br.readLine().toCharArray();

        for(int i=0; i<=n-8; i++) {
            for(int j=0; j<=m-8; j++) {
                answer = Math.min(answer, minCount(board, i, j));
            }
        }

        System.out.println(answer);
    }

    public static int minCount(char[][] board, int row, int col) {
        char[] color = {'W', 'B'};
        int index = 0;

        int count1 = 0;
        int count2 = 0;

        for(int i=row; i<row+8; i++) {
            for(int j=col; j<col+8; j++) {
                char current = board[i][j];

                if(current != color[index])
                    count1++;
                else
                    count2++;

                index ^= 1;
            }
            index ^= 1;
        }

        return Math.min(count1, count2);
    }
}
