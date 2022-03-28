package boj6064;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/6064
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            String[] input = br.readLine().split(" ");
            int m = Integer.parseInt(input[0]);
            int n = Integer.parseInt(input[1]);
            int x = Integer.parseInt(input[2]);
            int y = Integer.parseInt(input[3]);

            int count = x;
            int tempY = x % n;

            for(int j=0; j<n; j++) {
                tempY %= n;
                if(tempY == y || (tempY == 0 && y == n))
                    break;

                tempY += m;
                count += m;
            }

            if(count > lcm(m, n))
                System.out.println("-1");
            else
                System.out.println(count);
        }
    }

    public static int lcm(int x, int y) {
        int tempX = x;
        int tempY = y;
        while(tempY > 0) {
            int r = tempX % tempY;
            tempX = tempY;
            tempY = r;
        }

        return x * y / tempX;
    }
}
