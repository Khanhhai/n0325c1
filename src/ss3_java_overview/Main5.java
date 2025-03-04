package ss3_java_overview;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        // System.in là tieeu chuẩn để nhập dữ liệu
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào tên của bạn:");
       // scanner.nextLine(); // xóa hết toàn bộ dữ liêụ trong bộ nhớ scanner (dấu enter)
        String name = scanner.nextLine();

        System.out.print(" Nhập số tuổi của bạn:");
        int age = Integer.parseInt(scanner.nextLine());



        System.out.println(" tên của bạn là:" + name);
        System.out.println(" tuổi của bạn là:" + age);

    }
}
