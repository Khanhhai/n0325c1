package ss5_loop;
import java.util.Scanner;

/**
 *  (*) Chuyển đổi một số nguyên dương thành hệ nhị phân
 */
public class Exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương n:");
        int n = scanner.nextInt();

        String binary = "";

        while (n > 0) {
        int remainder = n % 2;
        binary = remainder + binary;
        n = n / 2;
    }
        System.out.println("Số nhị phân tương ứng là" + binary);
   }
}

