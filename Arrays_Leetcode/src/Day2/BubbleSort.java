package Day2;

import java.util.Scanner;

public class BubbleSort {
	public static int[] bubble_Sort(int[] nums) {

		
		for(int i = nums.length -1 ;i >= 1 ;i-- )
		{
			boolean x = true;
			for (int j = 0; j < i; j++) {
				if(nums[j]>nums[j+1])
				{
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
					x = false;
					
				}
				
				
			}
			System.out.println("Outer Loop Runned");
			if(x)
			{
				break;
			}
		}
		return nums;
	}
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter " +  i + " Element");
			arr[i] = sc.nextInt();
			
			
		}
		int[] nums = BubbleSort.bubble_Sort(arr);
		for (int i : nums) {
			System.out.println(i);
		}
		sc.close();
	}
}
