import static org.junit.Assert.*;

import org.junit.Test;


public class Sortingtest {

	@Test
	public void test() {
		assertEquals(true,sort.isSorted(num1));
		sort.insertionSort(num1);
		assertEquals(true,sort.isSorted(num1));
		Sorting.quicksort(num1);
		assertEquals(true,sort.isSorted(num1));
		assertEquals(false,sort.isSorted(num2));
		sort.insertionSort(num2);
		assertEquals(true,sort.isSorted(num2));
		assertEquals(false,sort.isSorted(num3));
		sort.quicksort(num3);
		assertEquals(true,sort.isSorted(num3));
		assertEquals(true,sort.isSorted(num4));
		sort.insertionSort(num4);
		assertEquals(true,sort.isSorted(num4));
		Sorting.quicksort(num4);
		assertEquals(true,sort.isSorted(num4));
		
	}
    int num1[] = new int[]{};
    int num2[] = new int[]{12,5,2,8,3,4,1,9,7,10,11,6};
    int num3[] = new int[]{6,5,2,8,3,11,12,10,7,9,11,4};
    int num4[] = new int[]{1,2,3,4,5,6,7,8,9,10};
    Sorting sort = new Sorting();
}
