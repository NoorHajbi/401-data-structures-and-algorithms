package sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InsertionSortTest {
    int[] arr = { 15, 2, 20, 12, 4 };
    int[] sortedArr = { 1, 2, 3, 4, 5 };
    int[] sortedDescArr = { 10, 9, 8, 7, 6 };

    InsertionSort sort = new InsertionSort();

    //1. Empty Array
    @Test
    public void testEmpty() {
        //Ascending
        int[] arrEmpty = { };
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
    assertNotNull("Problem with sorting array with size one", Arrays.toString(arrOneElement));

    //Descending
    sort.selectionSortDescending(arrOneElement);
    assertNotNull("Problem with sorting array with size one", Arrays.toString(arrOneElement));
}
    //    3. Sorted Array
    @Test
    public void testSortedArray() {
        //Ascending
        sort.selectionSort(sortedArr);
        assertNotNull("Problem with sorting array that already sorted", Arrays.toString(sortedArr));

        //Descending
        sort.selectionSortDescending(sortedDescArr);
        assertNotNull("Problem with sorting array that already sorted", Arrays.toString(sortedDescArr));
    }

    //    3. Normal Case
    @Test
    public void testSort() {
        //Ascending
        sort.selectionSort(arr);
        assertNotNull("Problem with sorting array", Arrays.toString(sortedArr));

        //Descending
        sort.selectionSortDescending(arr);
        assertNotNull("Problem with sorting array", Arrays.toString(sortedDescArr));
    }

}
