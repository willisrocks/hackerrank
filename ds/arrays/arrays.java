// https://www.hackerrank.com/challenges/arrays-ds

import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] itemsArray = new int[n];
        for (int i=0; i < n; i++) {
            itemsArray[i] = scanner.nextInt();
        }
        scanner.close();
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(itemsArray[i]);
            if (i != 0) {
                System.out.print(" ");
            }
        }
    }
    
}
