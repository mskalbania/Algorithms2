package testcasesgenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberGenerator {

    public static List<Integer> generateUnsortedListBetween(int a, int b) {

        List<Integer> sortedList = generateSortedIntListBetween(a, b);
        Collections.shuffle(sortedList);
        return sortedList;
    }

    public static List<Integer> generateSortedIntListBetween(int a, int b) {

        List<Integer> outputList = new ArrayList<>();

        for (int index = 0; a <= b; a++, index++) {
            outputList.add(a);
        }

        return outputList;
    }
}
