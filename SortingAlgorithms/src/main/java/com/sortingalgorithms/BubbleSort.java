package com.sortingalgorithms;

import java.util.Collections;
import java.util.List;

public class BubbleSort implements SortingAlgorithm {

    @Override
    public void sort(List<Integer> list) {

        for (int i = 0; i < list.size() - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < list.size() - 1; j++) {

                if (list.get(j) > list.get(j + 1)) {
                    Collections.swap(list, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
