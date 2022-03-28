package boj11651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://www.acmicpc.net/problem/11651
public class Main {

    private static class Point implements Comparable<Point> {
        int x;
        int y;

        private Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            return y != o.y ? y - o.y :  x - o.x;
        }

        @Override
        public String toString() {
            return x + " " + y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Point> points = new ArrayList<>();

        for(int i=0; i<n; i++) {
            String[] input = br.readLine().split(" ");
            points.add(new Point(Integer.parseInt(input[0]), Integer.parseInt(input[1])));
        }

        Collections.sort(points);

        points.forEach(System.out::println);
    }
}

