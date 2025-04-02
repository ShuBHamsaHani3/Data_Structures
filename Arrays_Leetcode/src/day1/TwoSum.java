package day1;

public class TwoSum {

public static int[] twoSum(int[] nums, int target) {
	   int i = 0  , j = 0 ;
        for( i = 0 ; i < nums.length ; i++)
        {
        	
        	for ( j = i + 1; j < nums.length; j++) {
				if(nums[i] + nums[j] == target)
				{
					
					
					break;
					
				}
			}
        }
        return new int[] {i,j};
        
    }
public static void main(String[] args) {
	int[] arr2 ={2,7,11,15};
	int[] arr = twoSum(arr2, 9);
	System.out.println(arr[0]);
	System.out.println(arr[1]);
}
}
