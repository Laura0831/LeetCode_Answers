package JavaProblems;

public class TwoSum {
    public static void main(String[] args) {
       int[] nums = {3,2,4};
        
       int[] result = twoSum(nums,6);
       System.out.println(result.toString());
    }


    public static int[] twoSum(int[] nums, int target) {
        int[] temp = {0,0};

        for(int i = 0; i<nums.length-1; i++){
            
            for(int j = i+1; j<nums.length; j++){
                
                if(nums[i]+nums[j] == target){
                    temp[0] = i; 
                    temp[1] = j; 
                    return temp;
                }
                
            }
            
        }
        return temp;
    }
}