/**
 * Wigglesort program takes an array and formats it into nums[0]<nums[1]>nums[2]<.....
 * @author Simir Cooper
 * @since 2/16/2021
 */
import java.util.Arrays;
public class Lab03 {
	/**
	 * This method takes in an array called nums and rearranges its format. 
	 * The for loop runs through each index and compares it to the next one in the array.
	 * Depending on the position of the index and its relationship to the next array entry
	 * one of three things occurs. If the index is even and value corresponding to it is greater than
	 * the one next to it the indices are swapped. If the index is odd and its corresponding value
	 * is less than the number that comes after it, the two indices are swapped. If neither 
	 * requirement is met the indices are left alone.
	 * @param nums
	 * @return int [] in the form of nums[0]<nums[1]>nums[2]<.....
	 */
	public static int [] WiggleSort(int[] nums) {
		int temp=0;
		for (int i =0; i<nums.length-1; i++) {
			if(i%2 ==0 && nums[i]>nums[i+1]) {
				temp = nums[i];
				nums[i] = nums[i+1];
				nums[i+1] = temp;
			}
			else if(i%2!=0 && nums[i]<nums[i+1]) {
				temp = nums[i];
				nums[i] = nums[i+1];
				nums[i+1] = temp;
			}
				
			}
		return nums;

		}
		

	public static void main(String[] args) {
		int[]array = {1,3,2,2,3,1};
		int[] array2 = {1,5,1,1,6,4};
		System.out.println(Arrays.toString(WiggleSort(array)));
		System.out.println(Arrays.toString(WiggleSort(array2)));


	}

}
