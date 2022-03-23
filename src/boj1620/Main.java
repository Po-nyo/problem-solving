package boj1620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://www.acmicpc.net/problem/1620
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Map<String, String> dictionary = new HashMap<>();

        for(int i=0; i<nm[0]; i++) {
            String input = br.readLine();
            dictionary.put(String.valueOf(i + 1), input);
            dictionary.put(input, String.valueOf(i + 1));
        }

        for(int i=0; i<nm[1]; i++) {
            System.out.println(dictionary.get(br.readLine()));
        }
    }
}
