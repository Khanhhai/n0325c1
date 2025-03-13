package ss6_method;

import java.util.Scanner;

/**
 *  Câu lệnh điều kiện và rẽ nhánh
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ký tự:");
        char c = scanner.next().charAt(0);

        System.out.println("Sau ký tự chuyển đổi Hoa thành thường " + toLowerCase( c));
    }
    public static char toLowerCase(char c){
        if (c >= 'A' && c <= 'Z'){
            c += 32;
        }
        return c;
    }
}
