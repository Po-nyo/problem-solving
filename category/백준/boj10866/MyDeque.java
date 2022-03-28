package boj10866;

import java.util.Deque;
import java.util.LinkedList;

public class MyDeque {

    private final Deque<Integer> deque = new LinkedList<>();

    public void push_front(int item) {
        deque.addFirst(item);
    }

    public void push_back(int item) {
        deque.addLast(item);
    }

    public int pop_front() {
        return deque.isEmpty() ? -1 : deque.pollFirst();
    }

    public int pop_back() {
        return deque.isEmpty() ? -1 : deque.pollLast();
    }

    public int size() {
        return deque.size();
    }

    public int empty() {
        return deque.isEmpty() ? 1 : 0;
    }

    public int front() {
        return deque.isEmpty() ? -1 : deque.peekFirst();
    }

    public int back() {
        return deque.isEmpty() ? -1 : deque.peekLast();
    }
}
