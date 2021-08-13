package boj10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// https://www.acmicpc.net/problem/10816
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();

        Map<Integer, Integer> map = new HashMap<>();

        String[] line = br.readLine().split(" ");

        for (String s : line) {
            int k = Integer.parseInt(s);
            map.put(k, map.getOrDefault(k, 0) + 1);
        }

        br.readLine();

        line = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();
        for (String s : line) {
            int k = Integer.parseInt(s);
            sb.append(map.getOrDefault(k, 0)).append(" ");
        }

        System.out.println(sb);
    }
}
