package boj11866;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://www.acmicpc.net/problem/11866
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++)
            list.add(i);

        int pos = k-1;

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while(true) {
            sb.append(list.get(pos)).append(", ");
            list.remove(pos);

            if(list.isEmpty())
                break;

            pos = (pos + k - 1) % list.size();
        }

        sb.delete(sb.length()-2, sb.length()).append(">");
        System.out.println(sb);
    }
}
