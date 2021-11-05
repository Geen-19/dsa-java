package arrays.arrays;

public class Two_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] twoSum(int[] arr, int target) {
        int[] dup = {0};
        for (int start = 0; start <= arr.length-1; start++) {
            for (int end = start +1; end <= arr.length-1; end++) {
                if(arr[start]+arr[end]==target){
                    int[] fin = {start , end};
                    return fin;

                }
            }

        }
        return dup;
    }
}
