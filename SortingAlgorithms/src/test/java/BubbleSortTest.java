import com.sortingalgorithms.BubbleSort;
import com.sortingalgorithms.SortingAlgorithm;
import org.junit.Before;
import org.junit.Test;
import testcasesgenerator.NumberGenerator;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BubbleSortTest {

    private List<Integer> sorted;
    private List<Integer> toSort;

    @Before
    public void initialize() {
        sorted = NumberGenerator.generateSortedIntListBetween(0, 10000);
        toSort = NumberGenerator.generateUnsortedListBetween(0, 10000);
    }

    @Test
    public void shouldCorrectlySortArray() {
        SortingAlgorithm sortingAlgorithm = new BubbleSort();

        sortingAlgorithm.sort(toSort);


        assertEquals(sorted, toSort);
    }
}