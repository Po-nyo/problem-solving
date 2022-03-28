package boj1966;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1966
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testCase = scan.nextInt();

        for(int i=0; i<testCase; i++) {
            int n = scan.nextInt();
            int m = scan.nextInt();

            Queue<Integer> queue = new LinkedList<>();
            for(int j=0; j<n; j++)
                queue.add(scan.nextInt());

            System.out.println(Solution.solution(queue, m));
        }
    }
}
