package boj5430;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

// https://www.acmicpc.net/problem/5430
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        loop: for(int i=0; i<testCase; i++) {
            String p = br.readLine();

            int n = Integer.parseInt(br.readLine());
            Deque<Integer> deque = new LinkedList<>();

            String[] elem = br.readLine()
                    .replaceAll("[\\[\\]]", "")
                    .split(",");

            if(n > 0) {
                for (String e : elem)
                    deque.add(Integer.parseInt(e));
            }

            int order = 0;

            for(int j=0; j<p.length(); j++) {
                switch (p.charAt(j)) {
                    case 'R': order ^= 1; break;
                    case 'D':
                        if(deque.isEmpty()) {
                            System.out.println("error");
                            continue loop;
                        }
                        else if(order == 0)
                            deque.removeFirst();
                        else
                            deque.removeLast();
                }
            }

            if(order == 0)
                printElem(deque.iterator());
            else
                printElem(deque.descendingIterator());
        }
    }

    public static void printElem(Iterator<Integer> it) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while(it.hasNext()) {
            sb.append(it.next());
            if(it.hasNext())
                sb.append(",");
        }
        sb.append("]");

        System.out.println(sb);
    }
}
