package ss4_condision;

import java.util.Scanner;

/**
 * Tìm số lớn nhất và số nhỏ nhất
 */
public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số a");
        int a = scanner.nextInt();

        System.out.println("Nhập số b");
        int b = scanner.nextInt();

        int max = (a > b) ? a : b;
        int min = (a < b) ? a : b;

        System.out.println("Số lớn nhất là " + max);
        System.out.println("Số lớn nhất là " + min);




    }
}
