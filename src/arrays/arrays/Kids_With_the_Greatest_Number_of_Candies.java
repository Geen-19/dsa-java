package arrays.arrays;

import java.util.List;

public class Kids_With_the_Greatest_Number_of_Candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int counter = 0;
        boolean[] ans = new boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            counter = 0;
            int n = extraCandies + candies[i];
            for (int j = 0; j < candies.length; j++) {
                if (n > candies[j]) {
                    counter = counter + 1;
                }
                if (counter == candies.length) {
                    ans[i] = true;
                } else {
                    ans[i] = false;
                }


            }
        }
        return ans;
    }
}
