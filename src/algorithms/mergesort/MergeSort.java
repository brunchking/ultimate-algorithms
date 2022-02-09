package algorithms.mergesort;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = new int[] {4, 3, 2, 1};
		MergeSort mg = new MergeSort();
		mg.mergeSort(arr, 0, 3);
		for (int data : arr) {
			System.out.print(data + " ");
		}
	}
	// 4 3 2 1
		
	public void merge(int[] nums, int start, int mid, int end) {
		int leftSize = mid - start + 1;
		int rightSize = end - mid;
		int[] leftArr = new int[leftSize];
		int[] rightArr = new int[rightSize];
		
		for (int i = 0; i < leftSize; i++) {
			leftArr[i] = nums[start + i];
		}
		for (int i = 0; i < rightSize; i++) {
			rightArr[i] = nums[mid + 1 + i];
		}
		int mergeIndex = start;
		int leftIndex = 0;
		int rightIndex = 0;
		
		while (leftIndex < leftSize && rightIndex < rightSize) {
			if (leftArr[leftIndex] <= rightArr[rightIndex]) {
				nums[mergeIndex++] = leftArr[leftIndex++];
			}
			else {
				nums[mergeIndex++] = rightArr[rightIndex++];
			}
		}
		while (leftIndex < leftSize) {
			nums[mergeIndex++] = leftArr[leftIndex++];
		}
		while (rightIndex < rightSize) {
			nums[mergeIndex++] = rightArr[rightIndex++];
		}
	}
	
	public void mergeSort(int[] nums, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(nums, start, mid);
			mergeSort(nums, mid + 1, end);
			merge(nums, start, mid, end);
		}
	}
}
