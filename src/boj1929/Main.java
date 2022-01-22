package boj1929;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1929
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        boolean[] isNotPrime = new boolean[n+1];
        isNotPrime[1] = true;

        for (int i=2; i<=n/2; i++) {
            if(isNotPrime[i])
                continue;
            for(int j=2; i*j<=n; j++)
                isNotPrime[i * j] = true;
        }

        for(int i=m; i<=n; i++) {
            if(!isNotPrime[i])
                System.out.println(i);
        }
    }
}
