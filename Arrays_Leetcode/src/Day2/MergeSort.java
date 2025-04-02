package Day2;

import java.util.Scanner;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter " +  i + " Element");
			arr[i] = sc.nextInt();
			
			
		}
		 MergeSort.mergeSort(arr,0,arr.length-1);
		 for (int i : arr) {
			System.out.println(i);
		}
		
		sc.close();
	}

	public static void mergeSort(int[] arr, int low, int high) {
		if(low == high)
		{
			return ;
		}
		int mid = (high+low)/2;
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		merge(arr,low,mid,high);
		
	}

	public static void merge(int[] arr, int low, int mid, int high) {
		
		int[] temp = new int[high - low + 1];
		int left = low;
		int right = mid+1;
		int i = 0;
		while(left <= mid && right<=high)
		{
			if(arr[left]<arr[right])
			{
				temp[i] = arr[left];
				left++;
			}
			else {
				temp[i] = arr[right];
				right++;
			}
			i++;
		}
		while(left <= mid)
		{
			temp[i] = arr[left];
			left++;
			i++;
		}
		while(right <= high)
		{
			temp[i] = arr[right];
			right++;
			i++;
		}
		
		for (int j = 0; j < temp.length; j++) {
		    arr[low + j] = temp[j];
		}

		
	}
	

}
