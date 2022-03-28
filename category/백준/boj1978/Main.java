package boj1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1978
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");

        boolean[] isNotPrime = new boolean[1001];
        isNotPrime[1] = true;

        for(int i=2; i<isNotPrime.length/2; i++) {
                if(isNotPrime[i])
                    continue;
            for(int j=2; i*j< isNotPrime.length; j++)
                isNotPrime[i*j] = true;
        }

        int count = 0;
        for (String number : numbers) {
            if(!isNotPrime[Integer.parseInt(number)])
                count++;
        }

        System.out.println(count);
    }
}
