package ss4_condision;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập n số nguyên từ bàn phím");
        int n = scanner.nextInt();

        for ( int i = 1; i <= n; i++)
        System.out.println( i +"\t");
    }
}
