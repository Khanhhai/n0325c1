package ss6_method;
/**
 * câu lênhj lặp
 */

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhâp vào số nguyên dương n: ");
        int n = scanner.nextInt();

        System.out.printf("Số đảo của %d: %d\n", n, reversedNumber(n));

        if (isSymmetricalNumber(n)) {
            System.out.printf("%d là số đối xứng\n", n);
        } else {
            System.out.printf("%d không là số đối xứng\n", n);
        }

        if (isSquareNumber(n)) {
            System.out.printf("%d là số chính phương\n", n);
        } else {
            System.out.printf("%d không là số chính phương\n", n);
        }
        if (isPrimeNumber(n)) {
            System.out.printf("%d là số nguyên tố\n", n);
        } else {
            System.out.printf("%d không là số nguyên tố \n", n);
        }

        System.out.printf("%d Tổng các số lẻ của %d \n", n);
    }

    static int reversedNumber(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 * digit;
            number /= 10;
        }
        return reversed;
    }

    static boolean isSymmetricalNumber(int number) {
        return number == reversedNumber(number);
    }

    static boolean isSquareNumber(int number) {
        return Math.sqrt(number) % 1 == 0;
    }

    static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % 1 == 0) {
                return false;
            }
            return true;
        }
    }
}



