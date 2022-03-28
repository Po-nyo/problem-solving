package boj1874;

import java.util.Stack;

public class Solution {

    public String solution(int[] seq) {
        Stack<Integer> stack = new Stack<>();
        int push = 1;

        StringBuilder sb = new StringBuilder();

        stack.push(push++);
        sb.append("+\n");

        loop:
        for (int target : seq) {
            while (true) {
                if (!stack.isEmpty()) {
                    if (target == stack.peek()) {
                        stack.pop();
                        sb.append("-\n");
                        continue loop;
                    }
                    else if (target > stack.peek()) {
                        stack.push(push++);
                        sb.append("+\n");
                    }
                    else
                        return "NO";
                }
                else {
                    if (target < push)
                        return "NO";
                    else {
                        stack.push(push++);
                        sb.append("+\n");
                    }
                }
            }
        }

        return sb.toString();
    }
}
