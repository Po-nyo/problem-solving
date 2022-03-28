package boj1920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// https://www.acmicpc.net/problem/1920
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");

        Set<String> set = new HashSet<>(Arrays.asList(inputs));

        n = Integer.parseInt(br.readLine());
        inputs = br.readLine().split(" ");

        for (String input : inputs) {
            if(set.contains(input))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
