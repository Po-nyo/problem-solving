package boj10773;

import java.util.Scanner;
import java.util.Stack;

// https://www.acmicpc.net/problem/10773
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int k = scan.nextInt();

        Stack<Long> stack = new Stack<>();

        for(int i=0; i<k; i++) {
            long input = scan.nextLong();

            if(input == 0)
                stack.pop();
            else
                stack.push(input);
        }

        stack.stream().reduce(Long::sum).ifPresentOrElse(System.out::println, () -> System.out.println(0));
    }
}
