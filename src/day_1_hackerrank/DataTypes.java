// https://www.hackerrank.com/challenges/30-data-types/problem
// Data Types

package day_1_hackerrank;

import java.util.Scanner;

public class DataTypes {
    public static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {

        /* Read input from STDIN. Print output to STDOUT. */

        int i = userInput.nextInt();
        double d = userInput.nextDouble();
        userInput.nextLine();
        String s = userInput.nextLine();

        System.out.println(i + 4);
        System.out.println(d + 4.0);
        System.out.println("HackerRank " + s);
    }
}
