// https://www.hackerrank.com/challenges/30-hello-world/problem?isFullScreen=true
// Day 0: Hello, World.

package day_0_hackerrank;

import java.util.Scanner;

public class HelloWorld {

    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        /* Read input from STDIN. Print output to STDOUT. */

        String inputString = userInput.nextLine();

        String str = "Hello, World.";
        System.out.println(str);

        System.out.println(inputString);
    }
}
