package Mentoring;

import java.util.Arrays;

public class Find_Min {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,-1,0,-3};
		
		
		
		System.out.println(minValue(nums));
	}
	public static int minValue( int[]  n ) {
		//create int variable min and assigned the max int value to it 
		int min = Integer.MAX_VALUE;
		// using for each loop to loop through each element of the array 
		for(int each: n) {
			// comparing each value of the array to min value 
			if(each < min)
		// if each value is less than min value than each value becomes new min value
				min = each;
		}
		return min;

		}
	
	public static int minimumValue( int[]  n ) {

		Arrays.sort( n );

		return  n [ 0 ];

		}

}
