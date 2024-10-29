package Vinsys;

public class SelectionSort {

    static void display(int arr[]) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    static void selectionSort(int arr[]) {
        int n = arr.length;
        for(int i=0;i<n-1;i++) {
        	int min =i;
        	for(int j=i+1;j<n;j++) {
        		if(arr[j]<arr[min]) {
        			min=j;
        		}
        		
        	}
        	 int temp = arr[min];
             arr[min] = arr[i];
             arr[i] = temp;
        }

    }

    public static void main(String[] args) {
        int[] ar = {6, 5, 4, 3, 2, 1};
        selectionSort(ar);
        display(ar);
    }
}
