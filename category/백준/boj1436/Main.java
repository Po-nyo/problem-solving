package boj1436;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1436
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int number = 666;
        int cnt = 1;

        while(cnt < n) {
            number++;
            if(String.valueOf(number).contains("666"))
                cnt++;
        }

        System.out.println(number);
    }
}
