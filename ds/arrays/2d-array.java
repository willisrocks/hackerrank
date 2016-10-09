// https://www.hackerrank.com/challenges/2d-array

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        Scanner scanner = new Scanner(System.in);
        int max = -9 * 7;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int item = scanner.nextInt();
                if (-9 <= item && item <= 9) {
                    matrix[i][j] = item;
                }
            }
        }
        scanner.close();
        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[i].length - 2; j++) {
                int hourGlass = matrix[i][j] +
                        matrix[i][j+1] +
                        matrix[i][j+2] +
                        matrix[i+1][j+1] +
                        matrix[i+2][j] +
                        matrix[i+2][j+1] +
                        matrix[i+2][j+2];
                if (hourGlass > max) {
                    max = hourGlass;
                }

            }
        }
        System.out.println(max);
    }
}
