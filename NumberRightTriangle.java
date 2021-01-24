/*
Aiswariya Suresh
112552877
Section 6
Lab 12

pattern to display
                        1
                   2    1
             3     2    1
  n    n-1...3     2    1

  method header: public static void displayPattern(int n)
 */

import java.util.Scanner;

public class NumberRightTriangle {
    public static void displayPattern(int n) {
        int rows;
        int index;
        int spaceCounter;
        for (rows = 1; rows <= n; rows++) {
            //outer loop does number of rows
            //in each row first print out the right number of spaces before the numbers
            //each number is followed by a space so there's 2 spaces for each number in the row
            spaceCounter = ((2 * n) - (2 * rows));
            while (spaceCounter > 0) {
                System.out.print(" ");
                spaceCounter--;
            }
            for (index = rows; index >= 1; index--) {
                //inner loop prints numbers in each rows
                if (index == 1)
                    System.out.print(index);
                else
                    System.out.print(index + " ");
            }
            System.out.print("\n");
        }

    }

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = myScan.nextInt();
        displayPattern(number);
    }

}
