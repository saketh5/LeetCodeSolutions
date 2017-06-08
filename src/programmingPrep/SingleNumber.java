import java.util.HashMap;
import java.util.Map;


//        2 4 3 4 5 7 1 


//With Space using a hashmap 
public class SingleNumber {

	public static void main(String[] args) {
		int[] num = {2,3,4,1,3,2,4};
		int singleNumber = singleNumber(num);
		System.out.println("Number is " + singleNumber);
	}

	static int singleNumberWithSpace(int[] nums) {
		Map<Integer, Integer> numHash = new HashMap<Integer,Integer>();

		for( int i = 0; i<nums.length; i++ ) {
			if(!numHash.containsKey(nums[i])) {
				numHash.put(nums[i], 1);
			}
			else { 
				int newValue =   ((numHash.get(nums[i]))+1);
				numHash.put(nums[i], newValue);
			}
		}

		for ( int j = 0; j <nums.length; j++) {
			if(numHash.containsKey(nums[j])) {
				if(numHash.get(nums[j])<=1) {
					return nums[j];
				}

			}
		}
		return 0;
	}

	//Without Space using Java XOR
	static int singleNumber(int[] nums) {
		
		int result = nums[0];
		for( int i = 1; i < nums.length; i++) {
			result = result ^ nums[i];		
		}	
		return result;
		
	}
}







