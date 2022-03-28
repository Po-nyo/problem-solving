package boj1074;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1074
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");

        int n = Integer.parseInt(inputs[0]);
        int r = Integer.parseInt(inputs[1]);
        int c = Integer.parseInt(inputs[2]);

        int startR = 0;
        int startC = 0;
        int endR = (int)Math.pow(2, n) - 1;
        int endC = (int)Math.pow(2, n) - 1;

        int count = 0;

        while(n-- > 0) {
            int position = find(startR, startC, endR, endC, r, c);
            int k = (int)Math.pow(2, n);

            switch(position) {
                case 1:
                    endR -= k;
                    endC -= k;
                    break;
                case 2:
                    startC += k;
                    endR -= k;
                    break;
                case 3:
                    startR += k;
                    endC -= k;
                    break;
                case 4:
                    startR += k;
                    startC += k;
            }

            count += (position - 1) * (k * k);
        }

        System.out.println(count);
    }

    // 어느 영역인지 구하기
    public static int find(int startR, int startC, int endR, int endC, int row, int col) {
        int midR = (startR + endR) / 2;
        int midC = (startC + endC) / 2;

        if(row <= midR && col <= midC)
            return 1;
        else if(row <= midR && col > midC)
            return 2;
        else if(row > midR && col <= midC)
            return 3;
        else
            return 4;
    }
}
