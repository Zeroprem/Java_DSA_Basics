package Vinsys;


public class BinnarySearch {

    public static int binarySearch(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;

       
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) return mid;
            else if (target > nums[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
    	 int[] a = new int[128];
         for (int i = 0; i < a.length; i++) {
             a[i] = i + 1; 
         }
        int target = 7;
      
        int ind = binarySearch(a, target);
        if (ind == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + ind);
    }
} 

