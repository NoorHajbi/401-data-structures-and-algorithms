package sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InsertionSortTest {
    int[] arr = {15, 2, 20, 12, 4};
    int[] sortedArr = {1, 2, 3, 4, 5};
    int[] sortedDescArr = {10, 9, 8, 7, 6};

    int[] reverseSorted = {20,18,12,8,5,-2};
    int[] fewUniques = {5,12,7,5,5,7};
    int[] nearlySorted = {2,3,5,7,13,11};

    InsertionSort sort = new InsertionSort();

    //1. Empty Array
    @Test
    public void testEmpty() {
        //Ascending
        int[] arrEmpty = {};
        sort.selectionSort(arrEmpty);
        assertNotNull("Problem with sorting empty array", Arrays.toString(arrEmpty));

        //Descending
        sort.selectionSortDescending(arrEmpty);
        assertNotNull("Problem with sorting empty array", Arrays.toString(arrEmpty));

    }

    //    2. one element Array
    @Test
    public void testOneElement() {
        //Ascending
        int[] arrOneElement = {1};
        sort.selectionSort(arrOneElement);
        assertEquals("[1]", Arrays.toString(arrOneElement));

        //Descending
        sort.selectionSortDescending(arrOneElement);
        assertEquals("Problem with sorting array with size one","[1]", Arrays.toString(arrOneElement));
    }

    //    3. Sorted Array
    @Test
    public void testSortedArray() {
        //Ascending
        sort.selectionSort(sortedArr);
        assertEquals("Problem with sorting array that already sorted","[1, 2, 3, 4, 5]", Arrays.toString(sortedArr));

        //Descending
        sort.selectionSortDescending(sortedDescArr);
        assertNotNull("Problem with sorting array that already sorted", Arrays.toString(sortedDescArr));
    }

    //    3. Normal Case
    @Test
    public void testSort() {
        //Ascending
        sort.selectionSort(arr);
        assertEquals("Problem with sorting array","[2, 4, 12, 15, 20]", Arrays.toString(arr));

        //Descending
        sort.selectionSortDescending(arr);
        assertNotNull("Problem with sorting array", Arrays.toString(arr));
    }

    //    4. Happy path
    @Test
    public void happyPath() {
        //1.
        //Ascending
        sort.selectionSort(reverseSorted);
        assertEquals("Problem with sorting array","[-2, 5, 8, 12, 18, 20]", Arrays.toString(reverseSorted));

        //Descending
        sort.selectionSortDescending(reverseSorted);
        assertNotNull("Problem with sorting array", Arrays.toString(reverseSorted));

        //2.
        //Ascending
        sort.selectionSort(fewUniques);
        assertEquals("Problem with sorting array","[5, 5, 5, 7, 7, 12]", Arrays.toString(fewUniques));

        //Descending
        sort.selectionSortDescending(fewUniques);
        assertNotNull("Problem with sorting array", Arrays.toString(fewUniques));

        //3.
        //Ascending
        sort.selectionSort(nearlySorted);
        assertEquals("Problem with sorting array","[2, 3, 5, 7, 11, 13]", Arrays.toString(nearlySorted));

        //Descending
        sort.selectionSortDescending(nearlySorted);
        assertNotNull("Problem with sorting array", Arrays.toString(nearlySorted));
    }
}
