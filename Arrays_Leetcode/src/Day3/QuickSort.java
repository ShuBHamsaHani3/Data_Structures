package Day3;

import java.util.Scanner;

import Day2.MergeSort;

public class QuickSort {
	static void Sort(int[] arr , int low , int high)
	{
		if(low<high)
		{
			int pivot = partitionIndex(arr,low,high);
			Sort(arr,pivot+1,high);
			Sort(arr,low,pivot-1);

		}
	}
	static int partitionIndex(int[] arr , int low , int high)
	{
		int i = low ;
		int j = high;
		int pivot = low;
		while(i<j)
		{
			while(arr[i]<arr[pivot] && i <=high)
			{
				i++;
			}
			while(arr[j]>arr[pivot] && j >=high)
			{
				j--;
			}
			if(i<j)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]=temp;
			}
		}
		return j;
	}

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
}
