package boj1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// https://www.acmicpc.net/problem/1260
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int v = Integer.parseInt(input[2]);

        int[][] matrix = new int[n][n];
        for(int i=0; i<m; i++) {
            input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            matrix[a-1][b-1] = 1;
            matrix[b-1][a-1] = 1;
        }

        StringBuilder sb = new StringBuilder();

        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.add(v-1);

        loop:
        while(!stack.isEmpty()) {
            int current = stack.pop();
            if(!visited.contains(current))
                sb.append(current + 1).append(" ");
            visited.add(current);
            stack.add(current);

            for(int i=0; i<matrix.length; i++) {
                if(matrix[current][i] == 1 && !visited.contains(i)) {
                    stack.push(i);
                    continue loop;
                }
            }
            stack.pop();
        }
        System.out.println(sb);

        visited.clear();
        sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v-1);
        visited.add(v-1);

        while(!queue.isEmpty()) {
            int current = queue.poll();
            sb.append(current + 1).append(" ");

            for(int i=0; i<matrix.length; i++) {
                if(matrix[current][i] == 1 && !visited.contains(i)) {
                    queue.add(i);
                    visited.add(i);
                }
            }
        }
        System.out.println(sb);
    }
}
