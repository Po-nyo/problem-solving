package boj9012;

import java.util.Scanner;
import java.util.Stack;

// https://www.acmicpc.net/problem/9012
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testCase = scan.nextInt();

        scan.nextLine();
        for(int i=0; i<testCase; i++) {
            String input = scan.nextLine();
            System.out.println(check(input));
        }
    }

    public static String check(String input) {
        Stack<Character> stack = new Stack<>();

        for(int j=0; j<input.length(); j++) {
            char current = input.charAt(j);

            if(current == '(')
                stack.push(current);
            else {
                if(stack.isEmpty())
                    return "NO";
                else
                    stack.pop();
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }
}
