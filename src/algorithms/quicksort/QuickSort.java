package algorithms.quicksort;

public class QuickSort {
	public void quickSort(int[] nums, int start, int end) {
		if (start < end) {
			int pivot = partition(nums, start, end);
			quickSort(nums, start, pivot - 1);
			quickSort(nums, pivot + 1, end);
		}
	}

	public int partition(int[] nums, int start, int end) {
		int pivot = nums[end];
		int left = start;
		
		for (int right = start; right < end; right++) {
			if (nums[right] < pivot) {
				swap(nums, left++, right);
			}
		}
		swap(nums, left, end);
		return left;
	}
	
	public void swap(int[] nums, int start, int end) {
		int temp = nums[start];
		nums[start] = nums[end];
		nums[end] = temp;
	}
}
