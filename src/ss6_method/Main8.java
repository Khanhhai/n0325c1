package ss6_method;

import java.util.Scanner;

/**
 * Nhập và in thông tin của một nhân viên
 */
public class Main8 {
    static String hoten;
    static int tuoi;
    static String gioTinh;
    static double mucLuong;
    static double diemTrungBinh;

    public static void main(String[] args) {
        nhapThongTin();
        xuatThongTin();
    }

    static void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào tên: ");
        hoten = scanner.nextLine();

        System.out.print("Nhập vào tuổi: ");
        tuoi = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập vào giới tính: ");
        gioTinh = scanner.nextLine();

        System.out.print("Nhập vào mức lương: ");
        mucLuong = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập vào điểm trung bình: ");
        diemTrungBinh = Double.parseDouble(scanner.nextLine());
    }

    static void xuatThongTin() {
        System.out.println("Tên: " +hoten);
        System.out.println("Tuôi: " +tuoi);
        System.out.println("Giới tính: " +gioTinh);
        System.out.println("Mức lương: " +mucLuong);
        System.out.println("Điểm trung bình: "+diemTrungBinh);

    }
}
