package arrays.arrays;

public class Find_the_Highest_Altitude {
    public int largestAltitude(int[] gain) {
        int[] pain = new int[gain.length+1];
        pain[0] = 0;
        pain[1] = gain[0];
        for (int i = 2; i < pain.length ; i++) {
            for (int j = 1; j <i ; j++) {
                pain[i] = pain[i-1]+ gain[j] ;
            }
        }
        int max = pain[0];
        for (int i = 0; i < pain.length; i++) {
            if(pain[i]>max){
                max = pain[i];
            }
        }
        return max;
    }
}
