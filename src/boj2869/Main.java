package boj2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2869
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int v = Integer.parseInt(inputs[2]);

        int c = a - b;
        v -= a;

        int answer = v/(a-b) + 1;
        if(v % c != 0)
            answer++;

        System.out.println(answer);
    }
}
