package boj2775;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2775
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testCase = scan.nextInt();

        for(int i=0; i<testCase; i++) {
            int k = scan.nextInt();
            int n = scan.nextInt();

            System.out.println(count(k, n));
        }
    }

    public static int count(int k, int n) {
        if(k == 0)
            return n;
        else {
            int sum = 0;

            for(int i=1; i<=n; i++)
                sum += count(k-1, i);

            return sum;
        }
    }
}
