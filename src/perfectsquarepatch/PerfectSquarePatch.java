package perfectsquarepatch;

import java.util.Arrays;

public class PerfectSquarePatch {
    public static int[][] squarePatch (int n) {

        // n will determine the number of sub-arrays
        // n will determine the number of elements in each sub-array
        // n will determine the value of each element within each sub-array



        int[][] squareArray = new int[n][n];

        for ( int i = 0; i < squareArray.length; i++) {
//            System.out.println(Arrays.toString( squareArray[i] ));
            for (int j = 0; j < squareArray[i].length; j++) {
//                System.out.println(squareArray[i][j]);
                squareArray[i][j] = n;

            }
        }

        for (int[] subarr: squareArray) {
//            Arrays.fill(subarr, n);

        }

        for (int[] subarr: squareArray) {
            for (int i = 0; i < subarr.length; i++) {
                subarr[i] = n;
            }
        }

//        System.out.println("\n\n" + Arrays.toString(squareArray));

        return squareArray;

    }

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {

            int num = i;

            int[][] square = squarePatch(num);

            System.out.println(Arrays.deepToString(square));
        }

//        System.out.println("squarePatch("+num+") -> [");
//        for (int i = 0; i < square.length; i++) {
//            System.out.println("\t" + Arrays.toString(square[i] ));
//        }
//        System.out.println("]");


    }
}
