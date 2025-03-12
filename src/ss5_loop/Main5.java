package ss5_loop;

public class Main5 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) { // hàng
            for (int j = 1; j <= n; j++) { // cột
                if (i == 1  || j == 1 || j == n){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

