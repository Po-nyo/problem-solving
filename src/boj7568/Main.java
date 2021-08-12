package boj7568;

import java.util.Scanner;

// https://www.acmicpc.net/problem/7568
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for(int i=0; i<n; i++) {
            x[i] = scan.nextInt();
            y[i] = scan.nextInt();
        }

        int[] grade = calc(x, y);

        for (int g : grade)
            System.out.print(g + " ");
        System.out.println();
    }

    public static int[] calc(int[] x, int[] y) {
        int[] grade = new int[x.length];

        for(int i=0; i<grade.length; i++) {
            int cnt = 1;
            int currentX = x[i];
            int currentY = y[i];

            for(int j=0; j<grade.length; j++) {
                if(i==j)
                    continue;
                if(x[j] > currentX && y[j] > currentY)
                    cnt++;
            }

            grade[i] = cnt;
        }

        return grade;
    }
}
