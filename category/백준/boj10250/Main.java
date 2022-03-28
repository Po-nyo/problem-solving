package boj10250;

import java.util.Scanner;

// https://www.acmicpc.net/problem/10250
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testCase = scan.nextInt();

        for(int i=0; i<testCase; i++) {
            int h = scan.nextInt();     // 호텔의 층수
            int w = scan.nextInt();     // 각 층의 방 수
            int n = scan.nextInt();     // n 번째 손님

            int room = n / h + 1;
            int floor = n % h;

            if(floor == 0) {
                floor = h;
                room--;
            }

            System.out.print(floor);
            System.out.printf("%02d\n", room);
        }
    }
}
