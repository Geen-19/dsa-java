package arrays.StackStars;

public class StackingStars {

        public static void main(String[] args) {
            int j;
            int i = 1;
            while (i<6){
                j = 0;
                while(j<i){
                    System.out.print("*"+" ");
                    j = j +1;
                }
                System.out.println();
                i = i +1;
            }
        }
    }
