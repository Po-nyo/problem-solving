package boj1697;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1697
// dp
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] dp = new int[100001];

        for(int i=0; i<n; i++) {
            dp[i] = n - i;
        }

        for(int i=n; i<dp.length; i++) {
            dp[i] = i - n;
            if(i % 2 == 0)
                dp[i] = Math.min(dp[i], dp[i/2] + 1);
            else {
                dp[i] = Math.min(dp[i], dp[i/2] + 2);
                dp[i] = Math.min(dp[i], dp[i/2+1] + 2);
            }
        }

        System.out.println(dp[k]);
    }
}
