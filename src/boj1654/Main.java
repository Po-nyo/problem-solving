package boj1654;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1654
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int k = scan.nextInt();
        int n = scan.nextInt();
        long[] lineLength = new long[k];

        long max = 0;
        for(int i=0; i<lineLength.length; i++) {
            lineLength[i] = scan.nextLong();
            max = Math.max(max, lineLength[i]);
        }

        long min = 1;
        while(min <= max) {
            long mid = (min + max) / 2;
            long sum = 0;

            for (long len : lineLength)
                sum += len/mid;

            if (sum < n)
                max = mid - 1;
            else
                min = mid + 1;
        }

        System.out.println(max);
    }
}
