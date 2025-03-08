package ss3_java_overview;

import java.util.Scanner;

/**
 * Tính tiền và thuế giá trị gia tăng cho sản phẩm
 */
public class Exercise3 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập tên sản phẩm: ");
            String tensanpham = scanner.nextLine();

            System.out.print("Nhập số lượng sản phẩm: ");
            int soluong = scanner.nextInt();

            System.out.print("Nhập đơn giá sản phẩm: ");
            double dongia = scanner.nextDouble();

            double tien = soluong * dongia;
            double thue = (tien * 10) / 100;

            System.out.println("Tên sản phảm là: " + tensanpham);
            System.out.println("Tổng tiền là: " + tien);
            System.out.println("Thuế phải trả là: " + thue);
        }
    }
