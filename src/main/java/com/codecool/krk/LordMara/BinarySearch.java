package com.codecool.krk.LordMara;

import java.util.Arrays;

public class BinarySearch {
    public boolean doRecursiveBinarySearch(int[] listOfIntegers, int searchValue) {
        if (listOfIntegers.length == 0) {
            return false;
        }

        int midpoint = listOfIntegers.length / 2;
        if (listOfIntegers[midpoint] == searchValue) {
            return true;
        } else if (searchValue < listOfIntegers[midpoint]) {
            return doRecursiveBinarySearch(Arrays.copyOfRange(listOfIntegers, 0, midpoint), searchValue);
        } else {
            return doRecursiveBinarySearch(Arrays.copyOfRange(listOfIntegers, midpoint, listOfIntegers.length), searchValue);
        }
    }
}
