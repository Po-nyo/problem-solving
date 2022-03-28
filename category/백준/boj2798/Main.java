package boj2798;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2798
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] numbers = new int[n];
        for(int i=0; i<n; i++)
            numbers[i] = scanner.nextInt();

        int max = 0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int k=j+1; k<n; k++) {
                    int sum = numbers[i] + numbers[j] + numbers[k];
                    if(sum <= m)
                        max = Math.max(max, sum);
                }
            }
        }

        System.out.println(max);
    }
}
