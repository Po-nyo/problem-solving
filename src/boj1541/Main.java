package boj1541;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://www.acmicpc.net/problem/1541
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int[] operand = Arrays.stream(input.split("[-,+]")).mapToInt(Integer::parseInt).toArray();
        String[] operator = input.replaceAll("[0-9]", "").split("");

        int minusIndex = operand.length - 1;   // - 가 처음 나오는 위치
        for(int i=0; i<operator.length; i++) {
            if(operator[i].equals("-")) {
                minusIndex = i;
                break;
            }
        }

        int result = 0;
        for(int i=0; i<=minusIndex; i++)
            result += operand[i];

        for(int i=minusIndex + 1; i<operand.length; i++)
            result -= operand[i];

        System.out.println(result);
    }
}
