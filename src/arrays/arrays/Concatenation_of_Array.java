package arrays.arrays;

public class Concatenation_of_Array {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        int[] sum1 = new int[nums.length];
        int n = nums.length;

// helo
        for (int i = 0; i < 2*nums.length; i++) {
            if(i< nums.length){
                ans[i] = nums[i];
            }
            if(i>= nums.length){
                ans[i] = nums[i-n];
            }

        }
        return ans;

    }
}
