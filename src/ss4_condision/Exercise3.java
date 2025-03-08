package ss4_condision;

import java.util.Scanner;

/**
 * Đảo giá trị của hai biến
 */
public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất a");
        int a = scanner.nextInt();

        System.out.println("Nhập số thứ nhất a");
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a + ", b = " + b);
    }
}
