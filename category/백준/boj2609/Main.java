package boj2609;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2609
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int gcd = 1;

        int min = Math.min(n, m);
        for(int i=1; i<=min; i++) {
            if(n % i == 0 && m % i == 0)
                gcd = Math.max(gcd, i);
        }

        int lcm = m * n / gcd;

        System.out.println(gcd + "\n" + lcm);
    }
}
