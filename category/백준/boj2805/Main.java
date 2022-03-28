package boj2805;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2805
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] treeHeight = new int[n];
        long max = 0;

        for(int i=0; i<treeHeight.length; i++) {
            treeHeight[i] = scan.nextInt();
            max = Math.max(max, treeHeight[i]);
        }

        long min = 0;
        while(min <= max) {
            long mid = (min + max) / 2;

            long sum = 0;
            for (int i : treeHeight) {
                if(i >= mid)
                    sum += i - mid;
            }

            if(sum < m)
                max = mid - 1;
            else
                min = mid + 1;
        }

        System.out.println(max);
    }
}
