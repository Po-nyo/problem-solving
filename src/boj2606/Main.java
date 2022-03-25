package boj2606;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2606
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] graph = new int[v + 1][v + 1];

        for(int i=0; i<n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph[a][b] = graph[b][a] = 1;
        }

        Queue<Integer> q = new LinkedList<>();
        int[] visited = new int[v + 1];
        int count = 0;
        q.add(1);
        visited[1] = 1;

        while(!q.isEmpty()) {
            int current = q.poll();
            count++;

            for(int i=1; i<=v; i++) {
                if(graph[current][i] == 1 && visited[i] == 0) {
                    q.add(i);
                    visited[i] = 1;
                }
            }
        }

        System.out.println(count - 1);
    }
}
