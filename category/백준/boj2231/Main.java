package boj2231;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2231
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int answer = 0;
        for(int i=1; i<n; i++) {
            int decomposition = i;
            int num = i;

            while(num > 0) {
                decomposition += num % 10;
                num /= 10;
            }

            if(decomposition == n) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}
