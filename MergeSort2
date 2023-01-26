
public class MergeSort {

    public void mergeSort(int[] array) {
        // TODO-Lab2.4: delegate to private mergeSort.  Follow example in QuickSort
        if(array != null){
            mergeSort(array, 0, array.length-1);
}
    }

    private void mergeSort(int[] array, int start, int end) {
        // TODO-Lab2.4: Implement the logic below
        //split left and right
        //if length is greater than 1
        if(start < end){
            int middle = (end- start)/2 + start;
            mergeSort(array, start, middle);
            mergeSort(array, middle +1, end);
            merge(array, start, middle, end);

        }

    }

    private void merge(int[] array, int start, int middle, int end) {
        // TODO-Lab2.4: Implement the logic below
        //compare values and save in appropriate array location
        int lsubarray = start;
        int rsubarray = middle +1;

        int [] arrayTemp = new int[(end-start)+1];

        for(int k=0; k < arrayTemp.length; k++){
            if(lsubarray <= middle && (rsubarray > end || array[lsubarray] <= array[rsubarray])){
                arrayTemp[k] = array[lsubarray];
                lsubarray++;
            }
            else {
                arrayTemp[k] = array[rsubarray];
                rsubarray++;
            }
        }
        System.arraycopy(arrayTemp, 0, array, start, arrayTemp.length);
    }

    public static void main(String[] arge) {
        MergeSort sorter = new MergeSort();
        int[] array = new int[]{4, 5, 33, 17, 3, 21, 1, 16};
        System.out.println("Unsorted:");
        for (int a : array) {
            System.out.println(a);
        }
        sorter.mergeSort(array);
        System.out.println("Sorted:");
        for (int a : array) {
            System.out.println(a);
        }
    }
}
