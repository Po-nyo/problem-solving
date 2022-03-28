package boj2292;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2292
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int roomNum = 1;
        int cnt = 1;

        while (roomNum < n) {
            roomNum += 6 * cnt++;
        }

        System.out.println(cnt);
    }
}
