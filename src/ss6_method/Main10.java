package ss6_method;

/**
 * cau lenj lap
 */
public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhập số nguyên dương n: ");
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Bạn hãy nhập số nguyên dương (n > 0), vui lòng nhập lại!!!");
            }
        } while (n <= 0);

        System.out.println("S = "+ sumA(n));
        System.out.println("S = "+ sumB(n));
        System.out.println("S = "+ sumC(n));
        System.out.println("S = "+ factorialD(n));
        System.out.println("S = "+ sumE(n));
    }

    public static int sumA(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumB(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static double sumC(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public static int factorialD(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }

    public static int sumE(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += factorialD(i);
        }
        return sum;
    }
}