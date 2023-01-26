public class MergeSort {
    public static void mergeSort(int[] array) {
        //arrayLength is the length we will be using this value to calculate the middle point
        int arrayLength = array.length;
        //base condition, if the array length is 1 it will just return
        //for the rest of the cases, the recursive call will be executed
        if (arrayLength < 2) {
            return;
        }
        //midpoint in the array length/2(example 10 / 2 = 5)
        int mid = arrayLength / 2;

        //left sub array, with example 5 elements
        int[] leftArray = new int[mid];

        //right sub array, length minus mid, with example 5 elements
        int[] rightArray = new int[arrayLength - mid];

        //loop filling up the left half of the array
        for (int i = 0; i < mid; i++) {
            leftArray[i] = array[i];
        }
        //loop filling up the right half of the array, start at mid point
        for (int i = mid; i < arrayLength; i++) {
            rightArray[i - mid] = array[i];
        }
        //recursively call itself for left array
        mergeSort(leftArray);

        //recursively call itself for right array
        mergeSort(rightArray);

        //calling merge method to merge the arrays back together after sorting
        merge(array, leftArray, rightArray);

    }

    public static void merge(int[] a, int[] l, int[] r) {
        int left = l.length;
        int right = r.length;

        //set indices to 0, i = left array index, j = right array index, k = original array index
        int i = 0, j = 0, k = 0;

        //while left index is less than left and right index is less than right
        while (i < left && j < right) {
            //left value is less than or equal to right value, place the left value in the original array value
            if (l[i] <= r[j]) {
                a[k] = l[i];
                i++;
            }
            //else place the right value in the original array
            else {
                a[k] = r[j];
                j++;
            }
            k++;
        }
        //copy what is remaining in the left array into the original array
        while (i < left) {
            a[k] = l[i];
            i++;
            k++;
        }
        //copy what is remaining in the right array into the original array
        while (j < right) {
            a[k] = r[j];
            j++;
            k++;
        }
    }

        public static void main (String[]args){

            int[] testArray = {5, 1, 6, 2, 3, 4};
            mergeSort(testArray);
            for (int items : testArray) {
                System.out.println(items);
            }

        }
    }


