package com.hackerrank;

public class ReverseString {
    public static void main(String [] args) {
        String str = "aknxaskndajsknskjabcdjks";
        char[] arr = str.toCharArray();
        String result = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            result = result + arr[i];
        }

        System.out.println(result);
    }
}
