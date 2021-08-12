package boj1966;

import java.util.Queue;

public class Solution {

    public static int solution(Queue<Integer> queue, int pos) {
        int cnt = 0;

        while(pos > -1) {
            int current = queue.poll();
            pos--;

            if(queue.isEmpty())
                cnt++;
            else {
                if(queue.stream().anyMatch(i -> i > current)) {
                    queue.add(current);
                    if(pos == -1)
                        pos = queue.size() - 1;
                }
                else
                    cnt++;
            }
        }

        return cnt;
    }
}
