package boj9019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// https://www.acmicpc.net/problem/9019
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            String[] input = br.readLine().split(" ");
            int start = Integer.parseInt(input[0]);
            int end = Integer.parseInt(input[1]);

            Queue<Integer> q = new LinkedList<>();
            Map<Integer, String> visited = new HashMap<>();
            q.add(start);
            visited.put(start, "");

            while(!q.isEmpty()) {
                int k = q.poll();

                if(k == end)
                    break;

                int[] dslr = new int[4];
                String[] operate = {"D", "S", "L", "R"};
                dslr[0] = (k * 2) % 10000;
                dslr[1] = k == 0 ? 9999 : k - 1;
                dslr[2] = ((k * 10) % 10000) + (k / 1000);
                dslr[3] = ((k % 10) * 1000) + ((k / 10) % 1000);

                for(int j=0; j<dslr.length; j++) {
                    if(!visited.containsKey(dslr[j])) {
                        q.add(dslr[j]);
                        visited.put(dslr[j], visited.get(k) + operate[j]);
                    }
                }
            }

            System.out.println(visited.get(end));
        }
    }
}
