package pan.sorting;

public class SortingMain {

    public static void main(String[] args) {
        //For sorting
        int [] toSort={2,1,66,78,99,66,3,44,66,99,20};

        MergeSort mergeSort= new MergeSort();
        mergeSort.sort(toSort);
        System.out.println(toSort);
        for (int i = 0; i < toSort.length; i++) {
            System.out.println(toSort[i]);
        }
    }


}
