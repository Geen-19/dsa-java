package arrays.arrays;

public class Number_of_Good_Pairs {
    public int numIdenticalPairs(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i!=j) {
                    counter = counter + 1;
                }
            }
        }
        return counter/2;
    }
}
