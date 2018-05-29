package sorting;
//https://www.cs.cmu.edu/~adamchik/15-121/lectures/Sorting%20Algorithms/sorting.html
public class SortingTest {

	public static void main(String[] args) {
		int [] arr= {58,69,23,78,56,22,78};
		Sorting.bubbleSort(arr);
		
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println(">>>>>>>>>>>>>>");
		int [] arre= {58,69,3,78,4,22,78};
		int[] selectionSort = Sorting.selectionSort(arre);
		
		for (int i : selectionSort) {
			System.out.println(i);
		}
	}
}
