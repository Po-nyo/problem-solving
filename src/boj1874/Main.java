package boj1874;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1874
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] seq = new int[n];

        for(int i=0; i<seq.length; i++)
            seq[i] = scan.nextInt();

        System.out.println(new Solution().solution(seq));
    }
}
