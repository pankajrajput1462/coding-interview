package sorting.quickselect;


import org.junit.jupiter.api.Test;

/**
 * K the max element
 */

public class SearchAlgorithmsTest {

	@Test
	public void test() {

		System.out.println("quickSelect");
		int[] A = { 21, 3, 34, 5, 13};

		QuickSelect search = new QuickSelect();

		int quickSelect = search.quickselect(A, 1);
		System.out.println(quickSelect);

		/*int expResult[] = { 1, 2, 3, 5, 8, 13, 19, 21, 34, 55 };
		int k = expResult.length;*/
		/*for (int exp : expResult) {
			System.out.println(exp+ " "+search.quickSelect(A, k--));
			assertEquals(exp, search.quickSelect(A, k--));

		}*/
	}

}
