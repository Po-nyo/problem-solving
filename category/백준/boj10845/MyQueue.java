package boj10845;

import java.util.LinkedList;

public class MyQueue {

    private final LinkedList<Integer> queue = new LinkedList<>();

    public int empty() {
        return queue.isEmpty() ? 1 : 0;
    }

    public void push(int item) {
        queue.add(item);
    }

    public int pop() {
        return queue.isEmpty() ? -1 : queue.pop();
    }

    public int size() {
        return queue.size();
    }

    public int front() {
        return queue.isEmpty() ? -1 : queue.peekFirst();
    }

    public int back() {
        return queue.isEmpty() ? -1 : queue.peekLast();
    }
}
