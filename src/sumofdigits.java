/*Write a programme to sum of integer entered by user and also print the integer seprately*/

import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int num, digit;
        System.out.println("Enter The Number");
        num = object.nextInt();
        int sum = 0;
        while (num > 0) {
            digit = num % 10;
            num = num / 10;
            System.out.print(digit);
            sum = digit + sum;
            if (num > 0) {
                System.out.print(",");
            }

        }
        System.out.println(" ");
        System.out.print(sum);
    }

}