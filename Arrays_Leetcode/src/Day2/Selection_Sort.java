package Day2;

import java.util.Scanner;

public class Selection_Sort {
	public static int[] selectionSort(int[] nums) {
		for (int i = 0; i < nums.length-1; i++) {
			int mini = i;
			for (int j = i; j < nums.length; j++) {
				if(nums[j]<nums[mini])
				{
					mini = j;
				}
				
				
			}
			System.out.println(nums[mini]);
			int temp = nums[mini];
			nums[mini] = nums[i];
			nums[i] = temp;
		}
		System.out.println("_______________________________");
		return nums;

	}
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter " +  i + " Element");
			arr[i] = sc.nextInt();
			
			
		}
		int[] nums = Selection_Sort.selectionSort(arr);
		for (int i : nums) {
			System.out.println(i);
		}
		sc.close();
	}

}
