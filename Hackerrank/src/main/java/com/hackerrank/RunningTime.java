package com.hackerrank;

public class RunningTime {
    public static void main(String [] args) {
        int [] arr = {1,5,3,67,36,87,54};
        System.out.println(runningTime(arr));
    }

    public static int runningTime(int[] arr) {
        boolean isSorted = false;
        int shift = 0;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < arr.length - 1; i++) {
                for(int j = 0; j < arr.length - i - 1; j++) {
                    if(arr[j] > arr[j + 1]) {
                        int t = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = t;

                        shift++;
                        isSorted = false;
                    }
                }
            }
        }
        return shift;
    }

    private static void printArray(int[] arr)
    {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
}
