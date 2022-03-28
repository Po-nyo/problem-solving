package boj18111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// https://www.acmicpc.net/problem/18111
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        int b = Integer.parseInt(inputs[2]);

        Map<Integer, Integer> counter = new HashMap<>();
        int maxHeight = 0;

        for(int i=0; i<n; i++) {
            inputs = br.readLine().split(" ");

            for(int j=0; j<m; j++) {
                int groundHeight = Integer.parseInt(inputs[j]);
                counter.put(groundHeight, counter.getOrDefault(groundHeight, 0) + 1);
                maxHeight = Math.max(maxHeight, groundHeight);
            }
        }

        int time = 256 * n * m * 2;
        int height = 0;

        for(int i=maxHeight; i>=0; i--) {
            int upperCount = 0;
            int lowerCount = 0;

            for (int groundHeight : counter.keySet()) {
                int count = counter.get(groundHeight);

                if (groundHeight < i)
                    lowerCount += (i - groundHeight) * count;
                else if (i < groundHeight)
                    upperCount += (groundHeight - i) * count;
            }

            if (lowerCount <= upperCount + b) {
                int takenTime = lowerCount + 2 * upperCount;

                if (time > takenTime) {
                    height = i;
                    time = takenTime;
                }
            }
        }

        System.out.println(time + " " + height);
    }
}
