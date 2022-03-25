package boj5525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/5525
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        char[] seq = br.readLine().toCharArray();

        int len = 0;
        int count = 0;

        for(int i=2; i<m; i++) {
            if(seq[i-2] == 'I' && seq[i-1] == 'O' && seq[i] == 'I') {
                len++;
                i++;
            }
            else
                len = 0;

            if(len >= n)
                count++;
        }

        System.out.println(count);
    }
}
