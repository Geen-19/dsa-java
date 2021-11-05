package arrays.arrays;

public class Richest_Customer {
    public int maximumWealth(int[][] accounts) {
        int[] answer = new int[accounts.length];
        int[] som = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                answer[i] = answer[i] + accounts[i][j];
            }
        }
        int max = answer[0];
        for (int i = 0; i < answer.length; i++) {
            if(answer[i]>max){
                max = answer[i];
            }

        }
        return max;
    }
}
