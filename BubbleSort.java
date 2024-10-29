package Vinsys;

public class BubbleSort {

	 static void display(int arr[]) {
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}
	 static void bubbleSort(int arr[]) {
			int n=arr.length;
			for(int i=0;i<n;i++) {
				int flag=0;
				for(int j=0;j<n-1-i;j++) {
					if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;		
					}
					
				}
				if(flag==0) {
					break;
				}
			}
		}
	 
	public static void main(String[] args) {
		int [] ar= {6,5,4,3,2,1};
		bubbleSort(ar);
		
		display(ar);

	}

}
