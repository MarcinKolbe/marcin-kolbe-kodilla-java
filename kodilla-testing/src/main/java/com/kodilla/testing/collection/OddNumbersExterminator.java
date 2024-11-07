package com.kodilla.testing.collection;

import java.util.Iterator;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 != 0) iterator.remove();
        }
        return numbers;
    }
}
