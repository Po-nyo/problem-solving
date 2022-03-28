package boj1764;

import java.util.*;

// https://www.acmicpc.net/problem/1764
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Set<String> set = new HashSet<>();
        List<String> resultList = new ArrayList<>();

        scanner.nextLine();
        for(int i=0; i<n; i++)
            set.add(scanner.nextLine());
        for(int i=0; i<m; i++) {
            String input = scanner.nextLine();
            if(set.contains(input))
                resultList.add(input);
        }

        Collections.sort(resultList);
        System.out.println(resultList.size());
        for (String s : resultList) {
            System.out.println(s);
        }
    }
}
