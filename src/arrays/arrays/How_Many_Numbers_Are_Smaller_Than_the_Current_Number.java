package arrays.arrays;

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answer = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length ; j++) {
                if(nums[i]>nums[j]){
                    count = count +1;

                }

            }
            answer[i] = count;
        }
        return answer;
    }
}
