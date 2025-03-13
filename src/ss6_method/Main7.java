package ss6_method;
/**
 * Phương thức in ra n phần tử của dãy Fibonacy
 */

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhâp vào số lượng nguyên tử muốn in ra Fibonacy: ");
        int n = scanner.nextInt();

        System.out.printf("%d phần từ của dãy Fibonacy: ", n);
    }

    static void printsNelementsFibonacci(int n) {
        int f1 = 0;
        int f2 = 1;
        int fn = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(fn + "\t");

            f1 = f2;
            f2 = fn;

            fn = f1 + f2;
        }
    }
}
