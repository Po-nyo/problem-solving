package boj1259;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1259
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        loop: while(true) {
            String str = scan.nextLine();

            if(str.equals("0"))
                break;

            for(int i=0; i<str.length()/2; i++) {
                if(str.charAt(i) != str.charAt(str.length()-(i+1))) {
                    System.out.println("no");
                    continue loop;
                }
            }

            System.out.println("yes");
        }
    }
}
