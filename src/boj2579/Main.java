package boj2579;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2579
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] score = new int[n];

        for(int i=0; i<n; i++)
            score[i] = scanner.nextInt();

        int[] dp = new int[n];

        dp[0] = score[0];

        if(n == 1)
            System.out.println(dp[0]);
        else if(n == 2)
            System.out.println(score[0] + score[1]);
        else {
            dp[1] = score[0] + score[1];
            dp[2] = Math.max(score[0] + score[2], score[1] + score[2]);

            for(int i=3; i<n; i++)
                dp[i] = Math.max(score[i] + score[i-1] + dp[i-3], score[i] + dp[i-2]);

            System.out.println(dp[n-1]);
        }
    }
}
