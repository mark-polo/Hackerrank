package com.hackerrank;


/*

        Magic Square Rules :
        Count numbers start from 1 to n*n
                                      column
        1. start with 1 at position  (n/2 , n -1)
        2. Next position (i, j) => (row - 1, column +1)
        3. If row = -1 => row = n - 1
        4. If column = n => column = 0
        4. If pos is occupied then row = row + 1 , column = column - 2
        5. If (-1, n) => (0, n-2)

 */

public class MagicSquare {
    public static void main(String [] args) {
        magicSquare(3);
    }

    private static void magicSquare(int n) {

        if(n % 2 == 0) {
            System.out.println("Только нечетные");
            return;
        }

        // 1 step
        int [][] arr = new int[n][n];
        int number = 1;
        int row = 0;
        int column = n / 2;
        int curr_row;
        int curr_col;

        while (number <= n*n) {
            arr[row][column] = number;
            number++;
            curr_row = row;
            curr_col = column;

            // 2 step
            row -= 1; // i
            column += 1; // j

            // 3 step

            if(row == -1) {
                row = n - 1;
            }

            // 4 step

            if(column == n) {
                column = 0;
            }

            if(arr[row][column] != 0) {
                row = curr_row + 1;
                column = curr_col;
            }
        }

        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println(" ");
        }

    }

}