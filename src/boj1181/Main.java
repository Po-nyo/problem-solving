package boj1181;

import java.util.*;

// https://www.acmicpc.net/problem/1181
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        List<String> words = new ArrayList<>();
        scan.nextLine();
        for(int i=0; i<n; i++) {
            String word = scan.nextLine();
            if (!words.contains(word))
                words.add(word);
        }

        words.sort((word_a, word_b) -> {
            if (word_a.length() != word_b.length())
                return word_a.length() - word_b.length();
            else
                return word_a.compareTo(word_b);
        });

        for (String word : words) {
            System.out.println(word);
        }
    }
}
