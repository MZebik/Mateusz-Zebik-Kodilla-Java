package com.kodilla.testing.forum.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate( List<Integer> numbers) {
        List<Integer> exterminated = new ArrayList<>();
        if ((numbers.size() > 0) && (numbers != null)) {
            for (int even : numbers) {
                if (even % 2 == 0) { exterminated.add(even);}
            }
            return exterminated;
        } else {
            return exterminated;
        }
    }
}
