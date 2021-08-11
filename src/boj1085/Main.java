package boj1085;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1085
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();

        System.out.println(Math.min(Math.min(x, Math.abs(x - w)), Math.min(y, Math.abs(y - h))));
    }
}
