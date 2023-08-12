package com.webservice.java.datastructuresandalgorithms;


import java.util.Arrays;

class TestDuplicateChecker {
    public static void main(String[] args) {
        int[] arr = {1, 4, 4, 3, 4, 4, 5, 6, 6, 7, 8, 9, 9};
        DuplicateChecker checker = new DuplicateChecker(arr.length);
        checker.findDuplicates(arr);
    }
}

public class DuplicateChecker {
    private int duplicateCount = 0;
    private int[] cache;
    private int currentNumber;
    private boolean isDuplicate;

    public DuplicateChecker(int length) {
        this.cache = new int[length];
    }

    public void findDuplicates(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            currentNumber = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int comparedNumber = arr[j];
                checkAndSetCache(currentNumber);
                if (isDuplicate(comparedNumber)) {
                    System.out.println(currentNumber);
                    isDuplicate = false;
                    break;
                }
                isDuplicate = false;
            }
        }
    }

    private boolean isDuplicate(int comparedNumber) {
        return currentNumber == comparedNumber && !isDuplicate;
    }

    private void checkAndSetCache(int currentNumber) {
        isDuplicate = false;
        for (int k = 0; k < cache.length; k++) {
            if (currentNumber == cache[k]) {
                isDuplicate = true;
                break;
            }
        }
        if (!isDuplicate) {
            cache[duplicateCount] = currentNumber;
            duplicateCount += 1;
        }
    }

    @Override
    public String toString() {
        var builder = new StringBuilder();
        builder.append("User[")
                .append("duplicateCount=").append(duplicateCount)
                .append(", cache='").append(Arrays.toString(cache))
                .append(", currentNumber=").append(currentNumber)
                .append(", isDuplicate=").append(isDuplicate)
                .append(']');
        return builder.toString();
    }
}