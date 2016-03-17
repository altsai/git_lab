package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
		int i, j, newValue;
      	for (i = 1; i < unsortedArray.length; i++) {
            newValue = unsortedArray[i];
            j = i;
            while (j > 0 && unsortedArray[j - 1] > newValue) {
                  unsortedArray[j] = unsortedArray[j - 1];
                  j--;
            }
            unsortedArray[j] = newValue;
      	}
		
		return unsortedArray;
	}
}
