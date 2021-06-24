package com.hackerrank;

public class CountingValleys {
    public static void main(String [] args) {
        System.out.println(countingValleys(8 , "UDDDUDUU"));
    }

    public static int countingValleys(int steps, String path) {
        int altitude = 0;
        int num_valleys = 0;

        for(int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'U') {
                if(altitude == -1) {
                    num_valleys++;
                }
                altitude++;
            }
            if(path.charAt(i) == 'D') {
                altitude--;
            }
        }

        return num_valleys;

    }
}
