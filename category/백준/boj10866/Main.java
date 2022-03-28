package boj10866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10866
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        MyDeque deque = new MyDeque();

        for(int i=0; i<n; i++) {
            String[] input = br.readLine().split(" ");

            switch (input[0]) {
                case "push_front":
                    deque.push_front(Integer.parseInt(input[1])); break;
                case "push_back":
                    deque.push_back(Integer.parseInt(input[1])); break;
                case "pop_front":
                    System.out.println(deque.pop_front()); break;
                case "pop_back":
                    System.out.println(deque.pop_back()); break;
                case "size":
                    System.out.println(deque.size()); break;
                case "empty":
                    System.out.println(deque.empty()); break;
                case "front":
                    System.out.println(deque.front()); break;
                case "back":
                    System.out.println(deque.back());
            }
        }
    }
}
