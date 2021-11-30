package arrays.StackStars;

public class Stacking_Stars_Upside_Down {
    public static void main(String[] args) {
        for (int i = 5; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
