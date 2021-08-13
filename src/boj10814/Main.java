package boj10814;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// https://www.acmicpc.net/problem/10814
public class Main {

    private static class Member implements Comparable<Member> {
        int age;
        String name;

        private Member(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Member o) {
            return this.age - o.age;
        }

        @Override
        public String toString() {
            return age + " " + name;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        List<Member> members = new ArrayList<>();

        scan.nextLine();
        for(int i=0; i<n; i++) {
            String[] input = scan.nextLine().split(" ");
            members.add(new Member(Integer.parseInt(input[0]), input[1]));
        }

        Collections.sort(members);

        members.forEach(System.out::println);
    }
}
