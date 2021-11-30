package arrays.arrays;

import java.util.ArrayList;
import java.util.List;

public class One_Plus {
    public static long[] addToArrayForm(int[] nums) {
        long sum = 0;
        long rem;
        int counter = 0;
        long k = 1;
        for (int i = 0; i < nums.length; i++) {
            rem = nums[i];
            sum = sum * 10 + rem;
        }
        List<Integer> fun = new ArrayList<>();
        long fin = sum + k;
        long gna = fin;
        while (fin > 0) {
            fin = fin / 10;
            counter = counter + 1;
        }
        long[] reece = new long[counter];
        int[] ans = new int[counter];
        int help = counter - 1;
        while (help >= 0) {
            rem = gna % 10;
            reece[help] = rem;
            help--;
            gna = gna / 10;
        }
        return reece;
    }
}
