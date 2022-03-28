package boj11050;

import java.util.Scanner;

// https://www.acmicpc.net/problem/11050
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        System.out.println(getBinoCoef(n, k));
    }

    public static int getBinoCoef(int n, int k) {
        int[][] dp = new int[n + 1][];

        for(int i=0; i<dp.length; i++) {
            dp[i] = new int[i+1];

            for(int j=0; j<dp[i].length; j++) {
                if(j==0 || i==j)
                    dp[i][j] = 1;
                else
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }

        return dp[n][k];
    }
}
