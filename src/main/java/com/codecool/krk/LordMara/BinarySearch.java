package com.codecool.krk.LordMara;

import java.util.Arrays;
import java.util.List;

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

    public boolean doNotRecursiveBinarySearch(List<Integer> listOfIntegers, int searchValue) {
        if (listOfIntegers.size() == 0) {
            return false;
        }

        int first = 0;
        int last = listOfIntegers.size() - 1;

        while (first <= last) {
            int midpoint = first + last / 2;

            if (listOfIntegers.get(midpoint).equals(searchValue)) {
                return true;
            } else if (searchValue < listOfIntegers.get(midpoint)) {
                last = midpoint - 1;
            } else {
                first = midpoint + 1;
            }
        }
        return false;
    }
}
