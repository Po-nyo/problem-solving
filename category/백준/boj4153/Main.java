package boj4153;

import java.util.Arrays;
import java.util.Scanner;

// https://www.acmicpc.net/problem/4153
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            int[] triangle = new int[3];

            for(int i=0; i<triangle.length; i++)
                triangle[i] = scan.nextInt();

            if(triangle[0] == 0)
                break;

            Arrays.sort(triangle);

            if(Math.pow(triangle[2], 2) == Math.pow(triangle[0], 2) + Math.pow(triangle[1], 2))
                System.out.println("right");
            else
                System.out.println("wrong");
        }
    }
}
