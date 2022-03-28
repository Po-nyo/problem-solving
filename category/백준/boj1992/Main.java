package boj1992;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1992
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] arr = new int[n][n];

        scanner.nextLine();
        for(int i=0; i<n; i++) {
            String line = scanner.nextLine();
            for(int j=0; j<line.length(); j++)
                arr[i][j] = line.charAt(j) - '0';
        }

        rec(arr, 0, 0, n);
    }

    public static void rec(int[][] arr, int row, int col, int size) {
        if(isAllMatch(arr, row, col, size)) {
            System.out.print(arr[row][col]);
        }
        else {
            size /= 2;

            System.out.print("(");
            for(int i=0; i<2; i++) {
                for(int j=0; j<2; j++) {
                    rec(arr, row + size * i, col + size * j, size);
                }
            }
            System.out.print(")");
        }
    }

    public static boolean isAllMatch(int[][] arr, int row, int col, int size) {
        int i = arr[row][col];

        for(int r=row; r<row+size; r++) {
            for(int c=col; c<col+size; c++) {
                if(i != arr[r][c])
                    return false;
            }
        }

        return true;
    }
}
