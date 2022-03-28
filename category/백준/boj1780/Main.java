package boj1780;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://www.acmicpc.net/problem/1780
public class Main {

    public static int[] count = new int[3];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++)
            arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        rec(arr, 0, 0, n);

        for (int i : count)
            System.out.println(i);
    }

    public static void rec(int[][] arr, int row, int col, int n) {
        if(isAllMatch(arr, row, col, n))
            count[arr[row][col]+1]++;
        else {
            n /= 3;
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                   rec(arr, row + n * i, col + n * j, n);
                }
            }
        }
    }

    public static boolean isAllMatch(int[][] arr, int row, int col, int n) {
        int i = arr[row][col];
        for(int r=row; r<row+n; r++) {
            for(int c=col; c<col+n; c++) {
                if(arr[r][c] != i)
                    return false;
            }
        }
        return true;
    }
}
