package ss3_java_overview;

import java.util.Scanner;

/**
 * Phép toán cơ bản giữa hai số
 */
public class BasicMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a");
        int a = scanner.nextInt();

        System.out.println("Nhập số b");
        int b = scanner.nextInt();
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = (double) a / b; // dùng double để có thể chia ra số thập phân

        System.out.println("Tổng hai số a và b là: " + sum);
        System.out.println("Hiệu hai số a và b là: " + difference);
        System.out.println("Tích hai số a và b là: " + product);
        System.out.println("Thương hai số a và b là: " + quotient);
    }
}

