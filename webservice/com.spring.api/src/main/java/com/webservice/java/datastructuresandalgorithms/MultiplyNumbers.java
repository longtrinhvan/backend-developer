package com.webservice.java.datastructuresandalgorithms;


import java.util.ArrayList;
import java.util.TreeSet;

class TestMultiplyNumbers{
    public static void main(String[] args) {
        MultiplyNumbers m = new MultiplyNumbers();
        m.calculateArray1(new int[]{1, 2});
        m.calculateArray1(new int[]{1, 2, 3});
        m.calculateArray1(new int[]{1, 2, 3, 4});
        m.calculateArray1(new int[]{1, 2, 3, 4, 5});
        m.calculateArray1(new int[]{1, 2, 3, 4, 5, 6});
        m.calculateArray2(new int[]{1, 2});
        m.calculateArray2(new int[]{1, 2, 3});
        m.calculateArray2(new int[]{1, 2, 3, 4});
        m.calculateArray2(new int[]{1, 2, 3, 4, 5});
        m.calculateArray2(new int[]{1, 2, 3, 4, 5, 6});
    }
}
public class MultiplyNumbers {

    /**
     * Issue: Given an array of n elements of non-negative integers
     * A = [1, 6, 9, 5, 2, ...]
     * a. Print an array B which B[i] = mul(A[j]), j from 0 to n-1, j =! i
     * Ex:
     * A = [1, 2, 3]
     * ==> B = [2x3, 1x3, 1x2]
     * Your solution here:
     **/

    public void calculateArray1(int[] A) {
        if (A != null && A.length > 1) {
            int lengthB = 1;
            for (int k = 2; k <= A.length; k++) {
                lengthB += 2 * (k - 2);
            }
            Integer[] B = new Integer[lengthB];
            int currentIndex = 0;
            for (int j = A.length - 2; j >= 0; j--) {
                for (int i = A.length - 1; i > 0; i--) {
                    if (i != j) {
                        B[currentIndex] = (A[j] * A[i]);
                        currentIndex++;
                    }
                }
            }
            printArray(B);
        }
    }

    public void calculateArray2(int[] A) {
        if (A != null && A.length > 1) {
            int lengthB = 1;
            for (int k = 2; k <= A.length; k++) {
                lengthB += 2 * (k - 2);
            }
            String[] B = new String[lengthB];
            int currentIndex = 0;
            for (int j = A.length - 2; j >= 0; j--) {
                for (int i = A.length - 1; i > 0; i--) {
                    if (i != j) {
                        B[currentIndex] = A[j] + " x " + A[i];
                        currentIndex++;
                    }
                }
            }
            printArray(B);
        }
    }

    private <T> void printArray(T[] arr) {
        if (arr.length > 0) {
            var builder = new StringBuilder("B[");
            for (int i = 0; i < arr.length - 1; i++) {
                builder.append(arr[i]).append(", ");
            }

            ArrayList<String> cc = new ArrayList<>();
            TreeSet<String> treeSet = new TreeSet<String>();
            builder.append(arr[arr.length - 1]).append("]");
            System.out.println(builder.toString());
        }
    }
}
