package easy;
import java.util.*;
public class problem_1_2_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,4,5,6,7};
		int target = 9;
		
		int ans[] = twoSum(nums,target);
		
		for(int item:ans) {
			System.out.print(item+" ");
		}

	}
	 public static int[] twoSum(int[] nums, int target) {
	      Map<Integer, Integer> map = new HashMap<>();
	        
	        for(int i=0;i<nums.length;i++){
	            int complement = target-nums[i];
	            
	            if(map.containsKey(complement)){
	                return new int[] {map.get(complement), i};
	            }
	            map.put(nums[i],i);
	        }
	        throw new IllegalArgumentException("No match");
	    }
	}

	/* public int[] twoSum(int[] nums, int target) {
	      for(int i=0;i<nums.length;i++){
	          for(int j=i+1;j<nums.length;j++){
	              int complement = target-nums[i];
	              
	              if(nums[j]==complement){
	                  return new int[] {i,j};
	              }
	          }
	      }
	       throw new IllegalArgumentException("No match");
	    }*/



