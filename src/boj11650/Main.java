package boj11650;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// https://www.acmicpc.net/problem/11650
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
            return x != o.x ? x - o.x :  y - o.y;
        }

        @Override
        public String toString() {
            return x + " " + y;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        List<Point> points = new ArrayList<>();

        for(int i=0; i<n; i++)
            points.add(new Point(scan.nextInt(), scan.nextInt()));

        Collections.sort(points);

        points.forEach(System.out::println);
    }
}
