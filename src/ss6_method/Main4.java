package ss6_method;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập hệ số a ");
        double a = scanner.nextDouble();

        System.out.println("Nhập hệ số b ");
        double b = scanner.nextDouble();

        System.out.println("Nhập hệ số c ");
        double c = scanner.nextDouble();
        System.out.println("Nhập hệ số d ");
        double d = scanner.nextDouble();
        LevelOne(a, b);
        LevelTwo(a, b, c);
        System.out.printf("4 %d %d %d %d %d" , a, b, c, d, min(a, b, c, d));
    }

    public static void LevelOne(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiêm");
            }
        } else {
            double x = -b / a;
            System.out.println("Phương trình có ngiệm là x = " + x);
        }
    }

    public static void LevelTwo(double a, double b, double c) {
        if (a == 0) {
            LevelOne(b, c);
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nhiệm");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("nghiệm kém của phương trình là x = " + x);
            } else {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("nghiệm của phương trình x1 = " + x1 + "nghiệm của phương trình x2 = " + x2);
            }
        }
    }

    public static int min(int a, int b, int c, int d) {
        int min = Math.min(a, b);
         int min1 = Math.min(c, d);
         int min2 = Math.min(min,min1);
        return min2;
    }
}