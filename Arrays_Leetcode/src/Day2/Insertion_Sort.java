package Day2;

import java.util.Scanner;

public class Insertion_Sort {
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter " +  i + " Element");
			arr[i] = sc.nextInt();
			
			
		}
		int[] nums = Insertion_Sort.insertionSort(arr);
		for (int i : nums) {
			System.out.println(i);
		}
		sc.close();
	}

	public static int[] insertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int j = i;
			while(j>0 && arr[j-1]>arr[j])
			{
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--;
			}
			
		}
		return arr;
	}

}
