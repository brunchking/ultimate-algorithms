package algorithms.quicksort;

public class Main {
	public static void main(String[] args) {
		int[] nums = new int[] {1, 6, 5, 3, 4};
		int length = nums.length;
		
		QuickSort qs = new QuickSort();
		qs.quickSort(nums, 0, length - 1);
		for (int data : nums) {
			System.out.print(data + " ");
		}
	}

}