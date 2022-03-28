package boj15829;

import java.util.Scanner;

// https://www.acmicpc.net/problem/15829
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long len = scan.nextLong();
        scan.nextLine();
        String str = scan.nextLine();

        long r = 31;
        long m = 1234567891;

        long hash = 0;

        long pow = 1;
        for(int i=0; i<str.length(); i++) {
            char current = str.charAt(i);
            hash += (current - 'a' + 1) * pow;
            pow = (pow * r) % m;
        }

        hash %= m;

        System.out.println(hash);
    }
}
