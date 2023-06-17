package leetcode;

public class Search_Insert_Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,3,5};
		System.out.print(searchInsert(nums, 3));
	}
	
	public static int searchInsert(int[] nums, int target) {
        if(binarysearch(nums, target) >= 0) {
        	return binarysearch(nums, target);
        }
        else
        	return Math.abs(binarysearch(nums, target)) - 1; 
    }
	
	public static int binarysearch(int[] nums, int target) {
		int min = 0, max = nums.length - 1;
		while(max >= min) {
        	int mid = (min + max) / 2;
        	if(nums[mid] == target) {
        		return mid;
        	}
        	else if(nums[mid] > target) {
        		max = mid - 1;
        	}
        	else if(nums[mid] < target) {
        		min = mid + 1;
        	}
        }
		
		return -1 - min;
	}

}
