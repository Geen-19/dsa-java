package arrays.arrays;

public class Find_Numbers_with_Even_Number_of_Digits {
    public int findNumbers(int[] nums) {
        int count = 0;
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            while(nums[i]>0){
                int rem = nums[i]%10;
                nums[i] = nums[i]/10;
                n = n+1;
            }

            if(n%2==0){
                count = count+1;

            }
            n = 0;
        }
        return count;
    }
}
