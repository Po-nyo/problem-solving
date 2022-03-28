package boj1676;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1676
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;

        // 소인수분해하여 (2 x 5) 쌍 마다 0의 개수 생김
        while(n >= 5) {
            count += n / 5;
            n /= 5;
        }

        System.out.println(count);
    }
}
