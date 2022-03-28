package boj7662;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        for(int i=0; i<testCase; i++) {
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            int k = Integer.parseInt(br.readLine());

            for(int j=0; j<k; j++) {
                String[] input = br.readLine().split(" ");
                int n = Integer.parseInt(input[1]);
                switch (input[0]) {
                    case "I":
                        treeMap.put(n, treeMap.getOrDefault(n, 0) + 1);
                        break;
                    case "D":
                        if(!treeMap.isEmpty()) {
                            int key;
                            if(n == -1)
                                key = treeMap.firstKey();
                            else
                                key = treeMap.lastKey();

                            if(treeMap.put(key, treeMap.get(key) - 1) == 1)
                                treeMap.remove(key);
                        }
                }

            }
            if(treeMap.isEmpty())
                System.out.println("EMPTY");
            else {
                System.out.print(treeMap.lastKey() + " ");
                System.out.println(treeMap.firstKey());
            }
        }
    }
}
