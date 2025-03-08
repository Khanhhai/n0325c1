package ss4_condision;

import java.util.Scanner;

/**
 * Dịch số thành tiếng Anh
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số từ 1 đéne 10");
        int number = scanner.nextInt();

        String englishNumber;
        if (number == 1) {
            System.out.println("one");
        } else if (number == 2) {
            System.out.println("two");
        } else if (number == 3) {
            System.out.println("three");
        } else if (number == 4) {
            System.out.println("four");
        } else if (number == 5) {
            System.out.println("five");
        } else if (number == 6) {
            System.out.println("six");
        } else if (number == 7) {
            System.out.println("seven");
        } else if (number == 8) {
            System.out.println("eight");
        } else if (number == 9) {
            System.out.println("nine");
        } else if (number == 10) {
            System.out.println("ten");
        } else {
            System.out.println("Hãy nhập lại số từ 1 đến 10");

        }
    }
}
