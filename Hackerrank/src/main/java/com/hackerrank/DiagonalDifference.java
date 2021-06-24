package com.hackerrank;

public class DiagonalDifference {
    public static void main(String [] args) {
        int[][] arr = { {1,2,3}, {4,2,5}, {6,46,3}};

        System.out.println(diagonal(arr));
    }

    private static int diagonal(int [][] arr) {
        int left_to_right = 0;
        int right_to_left = 0;

        int rows = arr.length;
        int columns = arr[0].length;

        int i = 0 , j = 0, k = 0 , l = arr.length - 1;

        while(i < rows && j < columns && k < rows && l >= 0) {
            left_to_right += arr[i][j];
            right_to_left += arr[k][l];

            i += 1;
            k += 1;
            j += 1;
            l -= 1;
        }

        return Math.abs(left_to_right - right_to_left);
    }
}
