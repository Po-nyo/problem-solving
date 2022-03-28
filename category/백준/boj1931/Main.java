package boj1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://www.acmicpc.net/problem/1931
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] time = new int[n][2];

        for(int i=0; i<n; i++) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            time[i][0] = input[0];
            time[i][1] = input[1];
        }

        Arrays.sort(time, ((o1, o2) -> {
            if(o1[1] == o2[1])
                return o1[0] - o2[0];
            else
                return o1[1] - o2[1];
        }));

        int count = 0;
        int currentTime = 0;
        for (int[] ints : time) {
            if (ints[0] >= currentTime) {
                count++;
                currentTime = ints[1];
            }
        }

        System.out.println(count);
    }
}
