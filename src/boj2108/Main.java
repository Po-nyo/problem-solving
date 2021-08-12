package boj2108;

import java.util.*;

// https://www.acmicpc.net/problem/2108
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] seq = new int[n];
        int[] frequency = new int[8001];

        int sum = 0;
        for(int i=0; i<seq.length; i++) {
            seq[i] = scan.nextInt();
            frequency[seq[i] + 4000]++;
            sum += seq[i];
        }

        Arrays.sort(seq);

        int average = (int)Math.round((double)sum / seq.length);
        int median = seq[seq.length/2];
        int range = seq[seq.length-1] - seq[0];

        int maxFrequency = Arrays.stream(frequency).max().getAsInt();
        int cnt = 0;
        int maxFrequencyNum = 0;

        for (int i=seq[0]+4000; i<=seq[seq.length-1]+4000; i++) {
            if(frequency[i] == maxFrequency) {
                maxFrequencyNum = i - 4000;
                cnt++;
                if(cnt == 2)
                    break;
            }
        }

        System.out.println(average + "\n" + median + "\n" + maxFrequencyNum + "\n" + range);
    }
}
