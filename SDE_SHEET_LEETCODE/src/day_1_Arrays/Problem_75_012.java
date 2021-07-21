package day_1_Arrays;

public class Problem_75_012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,0,2,1,1,0};
		sortColors(arr);

	}
	
	public static void sortColors(int[] nums) {
        //by dutch national flag algorithm
        
        //declared 3 pointers for low mid and high
        //high will be the last element
        int high = nums.length-1;
        
        //low and mid will start from the 0
        int low=0;
        int mid =0;
        int temp;
        
        //while mid never crossed high 
        while(mid<=high){
            //this switch used to swap numbers
            switch(nums[mid]){
                    
                    //if the array of mid ==0 then swap low and mid
                    // and increment low and mid 
                case 0:{
                    temp=nums[low];
                    nums[low]=nums[mid];
                    nums[mid]=temp;
                    low++;
                    mid++;
                    break;
                }
                    //if nums of mid ==1 then increment mid
                case 1:
                    mid++;
                    break;
                    
                    //if mid == 2 then swap high and mid
                    //and decrement high value
                case 2:{
                    temp=nums[mid];
                    nums[mid]=nums[high];
                    nums[high]=temp;
                    high--;
                    break;
                    
                }
                    
                    
            }
        }
        
    }
	
	

}
