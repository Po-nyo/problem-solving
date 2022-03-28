package boj9375;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// https://www.acmicpc.net/problem/9375
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            int cnt = 1;
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();

            for(int j=0; j<n; j++) {
                String[] input = br.readLine().split(" ");
                map.put(input[1], map.getOrDefault(input[1], 0) + 1);
            }

            for(int v : map.values()) {
                cnt *= (v + 1);
            }

            System.out.println(cnt - 1);
        }
    }
}
