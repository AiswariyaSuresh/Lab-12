/*
Aiswariya Suresh
112552877
Lab 12
Section 6
 */

import java.util.Scanner;

public class IntegerReverse {
    public static void reverse(int number) {
        int findDigits = number;
        int digits = 0;
        //find number of digits in number
        while (findDigits % 10 != 0) {
            digits++;
            findDigits = findDigits / 10;
            //System.out.println(digits + " " + findDigits);
        }
        int reverse = 0;
        int newDigit;
        while (number % 10 != 0) {
            newDigit = number % 10;
            reverse += (newDigit * Math.pow(10, (digits - 1)));
            digits--;
            number = number / 10;

        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int input = stdin.nextInt();
        reverse(input);
    }
}
