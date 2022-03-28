package boj4949;

import java.util.Scanner;
import java.util.Stack;

// https://www.acmicpc.net/problem/4949
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            String input = scan.nextLine();

            if(input.equals("."))
                break;

            System.out.println(check(input));
        }
    }

    public static String check(String input) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<input.length(); i++) {
            char current = input.charAt(i);

            switch(current) {
                case '(':
                case '[': stack.push(current); break;
                case ')':
                case ']':
                    if(stack.isEmpty())
                        return "no";
                    else {
                        char pop = stack.pop();

                        if(current == ')' && pop == '[' || current == ']' && pop == '(')
                            return "no";
                    }
            }
        }

        return stack.isEmpty() ? "yes" : "no";
    }
}
