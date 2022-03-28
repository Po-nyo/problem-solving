package boj2630;

import java.util.Scanner;

public class Main {

    static int[] count = new int[2];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] paper = new int[n][n];

        for(int i=0; i<paper.length; i++) {
            for(int j=0; j<paper.length; j++)
                paper[i][j] = scanner.nextInt();
        }

        rec(paper, 0, 0, n);

        System.out.println(count[0]);
        System.out.println(count[1]);
    }

    public static void rec(int[][] paper, int row, int col, int size) {
        if(isAllMatch(paper, row, col, size))
            count[paper[row][col]]++;
        else {
            size /= 2;

            for(int i=0; i<2; i++) {
                for(int j=0; j<2; j++) {
                    rec(paper, row + (i * size), col + (j * size), size);
                }
            }
        }
    }

    public static boolean isAllMatch(int[][] paper, int row, int col, int size) {
        int color = paper[row][col];
        for(int r=row; r<row+size; r++) {
            for(int c=col; c<col+size; c++) {
                if(paper[r][c] != color)
                    return false;
            }
        }
        return true;
    }
}
