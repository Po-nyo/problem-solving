package boj1389;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://www.acmicpc.net/problem/1389
// 플로이드-와샬
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[][] dp = new int[n + 1][n + 1];

        for(int[] arr : dp)
            Arrays.fill(arr, Integer.MAX_VALUE);

        for(int i=0; i<m; i++) {
            input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            dp[a][b] = 1;
            dp[b][a] = 1;
        }

        // 플로이드-와샬
        // i 라는 정점을 지났을때 갱신될 수 있는 값 갱신
        for(int i=1; i<dp.length; i++) {
            for(int j=1; j<dp.length; j++) {
                for(int k=1; k<dp.length; k++) {
                    if(dp[i][k] != Integer.MAX_VALUE && dp[j][i] != Integer.MAX_VALUE)
                        dp[j][k] = Math.min(dp[j][k], dp[j][i] + dp[i][k]);
                }
            }
        }

        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for(int i=1; i<dp.length; i++) {
            int sum = 0;

            for(int j=1; j<dp.length; j++) {
                if(i == j)
                    continue;
                if(dp[i][j] != Integer.MAX_VALUE)
                    sum += dp[i][j];
            }

            if(min > sum) {
                min = sum;
                minIndex = i;
            }
        }

        System.out.println(minIndex);
    }
}
