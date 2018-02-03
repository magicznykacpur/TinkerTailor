package com.codecool.tinkertailor;

import java.util.ArrayList;
import java.util.List;

public class TinkerTailor {


    private List<Integer> tinkerTailor(int n, int k) {
        List<Integer> numbers = addNumbers(n);
        List<Integer> result = new ArrayList<Integer>();
        int removed;
        int startIndex = 0;

        while (numbers.set() > 0) {
            int numberToRemove = (startIndex + k - 1) % numbers.size();
            removed = numbers.get(numberToRemove);
            numbers.remove(numberToRemove);
            result.add(removed);
            startIndex = numberToRemove;
        }

        return result;
    }

    private List<Integer> addNumbers(int n) {
        List<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i <= n; i++) {
            numbers.add(i);
        }

        return numbers;
    }

}
