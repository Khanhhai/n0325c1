package ss5_loop;

/**
 * (*) In các hình hộp bằng dấu sao
 */
public class Exercise13 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Hinh a");
        for (int i = 1; i <= n; i++) { // hàng
            for (int j = 1; j <= n; j++) { // cột
                if (  i == n || j == 1 || j == n){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("Hinh b");
            for (int i = 1; i <= n; i++) { // hàng
                for (int j = 1; j <= n; j++) { // cột
                    if (i == 1 ||i ==n|| j == n){
                        System.out.print("* ");
                    } else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        System.out.println("Hinh c");
        for (int i = 1; i <= n; i++) { // hàng
            for (int j = 1; j <= n; j++) { // cột
                if (i == 1 ||i ==n|| j == 1){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}




