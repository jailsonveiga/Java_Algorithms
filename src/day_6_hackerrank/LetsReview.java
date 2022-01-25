package day_6_hackerrank;

import java.util.Scanner;

public class LetsReview {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int num = userInput.nextInt();

        String[] strArr = new String[num];

        for(int i = 0; i < num; i++) {
            strArr[i] = userInput.next();
            getDetails(strArr[i]);
        }
    }

    public static void getDetails(String str) {
        String evenChar = "";
        String oddChar = "";

        for(int i = 0; i < str.length(); i++) {
            if(i % 2 == 0) {
                evenChar += str.charAt(i);
            }
            else{
                oddChar += str.charAt(i);
            }
            System.out.println(evenChar + " " + oddChar );
        }
    }
}
