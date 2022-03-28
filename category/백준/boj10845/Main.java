package boj10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10845
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        MyQueue queue = new MyQueue();

        for(int i=0; i<n; i++) {
            String input = br.readLine();

            switch (input) {
                case "pop":
                    System.out.println(queue.pop()); break;
                case "size":
                    System.out.println(queue.size()); break;
                case "empty":
                    System.out.println(queue.empty()); break;
                case "front":
                    System.out.println(queue.front()); break;
                case "back":
                    System.out.println(queue.back()); break;
                default:
                    queue.push(Integer.parseInt(input.split(" ")[1]));
            }
        }
    }
}
