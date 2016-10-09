// https://www.hackerrank.com/challenges/dynamic-array

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int n; // number of sequences
        int q; // number queries
        int lastAns = 0; // last answer
        int x; // the sequence at (x ^ lastAns) % n
        int y; // the integer to append to the sequence
        int index; // (x ^ lastAns) % n
        int type; // type of query (1 or 2)
        ArrayList<Integer>[] seqList; // array of sequence lists
        Scanner scanner = new Scanner(System.in); // scanner object

        n = scanner.nextInt();
        q = scanner.nextInt();
        seqList = new ArrayList[n];

        // for the number of queries q
        for (int i = 0; i < q; i++) {
            type = scanner.nextInt();
            x = scanner.nextInt();
            y = scanner.nextInt();
            index = (x ^ lastAns) % n;

            // if query type is 1, we add y
            if (type == 1) {
                // list doesn't exit, so add it
                if (seqList[index] == null) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(y);
                    seqList[index] = list;
                } else { // list exists, so just add it
                    seqList[index].add(y);
                }
            } else if (type == 2) { // query type is 2
                // set lastAns and print it
                lastAns = seqList[index].get(y % seqList[index].size());
                System.out.println(lastAns);
            }
        }
    }
}
