package sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {
    int[] arr = {15, 2, 20, 12, 4};
    int[] sortedArr = {1, 2, 3, 4, 5};

    int[] reverseSorted = {20, 18, 12, 8, 5, -2};
    int[] fewUniques = {5, 12, 7, 5, 5, 7};
    int[] nearlySorted = {2, 3, 5, 7, 13, 11};

    MergeSort sort = new MergeSort();

    //1. Empty Array
    @Test
    public void testEmpty() {
        int[] arrEmpty = {};
        sort.mergeSort(arrEmpty);
        assertNotNull("Problem with sorting empty array", Arrays.toString(arrEmpty));
    }

    //    2. one element Array
    @Test
    public void testOneElement() {
        int[] arrOneElement = {1};
        sort.mergeSort(arrOneElement);
        assertEquals("[1]", Arrays.toString(arrOneElement));
    }

    //    3. Sorted Array
    @Test
    public void testSortedArray() {
        sort.mergeSort(sortedArr);
        assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(sortedArr));
    }

    //    3. Normal Case
    @Test
    public void testSort() {
        //Ascending
        sort.mergeSort(arr);
        assertEquals("[2, 4, 12, 15, 20]", Arrays.toString(arr));
    }

    //    4. Happy path
    @Test
    public void happyPath() {
        //1.
        sort.mergeSort(reverseSorted);
        assertEquals("[-2, 5, 8, 12, 18, 20]", Arrays.toString(reverseSorted));

        //2.
        sort.mergeSort(fewUniques);
        assertEquals("[5, 5, 5, 7, 7, 12]", Arrays.toString(fewUniques));

        //3.
        sort.mergeSort(nearlySorted);
        assertEquals("[2, 3, 5, 7, 11, 13]", Arrays.toString(nearlySorted));

    }
}
