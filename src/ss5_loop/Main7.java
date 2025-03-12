package ss5_loop;

public class Main7 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) { // hàng
            for (int j = 1; j <= n -i + 1; j++) { // cột
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}


