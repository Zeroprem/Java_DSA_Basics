package Vinsys;

public class InsertionSort {

	 static void insertionSorting(int[] arr) {
			
			
	        int n = arr.length;

	        for (int i = 1; i < n; ++i) {
	            int cur = arr[i];
	            int j = i - 1;

	            while (j >= 0 && arr[j] > cur) {
	                arr[j + 1] = arr[j];
	               j--;
	            }
	            arr[j + 1] = cur;	        }


	    }
	 static void display(int arr[]) {
			for(int a:arr) {
				System.out.print(a+" ");
				
			}
		}
	public static void main(String[] args) {
		int [] ar= {6,5,4,3,2,1};
		
		display(ar);
		insertionSorting(ar); //1
		display(ar);

	}

}
