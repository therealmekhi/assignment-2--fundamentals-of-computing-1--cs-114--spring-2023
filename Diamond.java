/* Mekhi Hall
 * Assignment 2
 * 2/23/2023
 * Printing a diamond shape, based on user input
 */

import java.util.Scanner;

public class Diamond {
    public static void main (String[] args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print("Input a number: ");
            int userinput = sc.nextInt();

            // Top half of diamond
            for (int i = 0; i < userinput / 2; i++) {
                printLine(userinput, i);
            }
            // Bottom half of diamond
            for (int i = userinput % 2 == 0 ? userinput / 2 - 1 : userinput / 2; i >= 0; i--) {
                printLine(userinput, i);
            }
        }
    }

    static void printLine(int userinput, int i)
    {
        for (int j = 0; j < (userinput - 1) - i; j++) {
            System.out.print(" ");
        }

        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }

        for (int j = 0; j < i + 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
