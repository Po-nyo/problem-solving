package boj1107;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// https://www.acmicpc.net/problem/1107
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int m = Integer.parseInt(br.readLine());

        List<String> broken = new ArrayList<>();
        if(m > 0)
            broken = Arrays.stream(br.readLine().split(" ")).collect(Collectors.toList());

        int min = Math.abs(Integer.parseInt(n) - 100);

        loop:
        for(int i=0; i<=999999; i++) {
            String s = String.valueOf(i);

            for(int j=0; j<s.length(); j++) {
                char c = s.charAt(j);

                if(broken.contains(String.valueOf(c)))
                    continue loop;
            }

            min = Math.min(min, Math.abs(i - Integer.parseInt(n)) + s.length());
        }

        System.out.println(min);
    }
}
