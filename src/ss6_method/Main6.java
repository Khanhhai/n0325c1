package ss6_method;

import java.util.Scanner;

/**
 * Tìm ước số chung lớn nhất (USCLN)
 */
public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào nguyên dương a:");
        int a = scanner.nextInt();

        System.out.print("Nhập vào nguyên dương b:");
        int b = scanner.nextInt();

        System.out.printf("Ước chung của 2 số %d là; %d",a,b,uscl(a,b));
    }
    static int uscl(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);

        int min = Math.min(a,b);
        int max = Math.max(a,b);

        if(max % min ==0){
            return min;
        }
        for(int i = min / 2 ; i>=1; i++){
            if(a % i == 0 && i == 0){
                return i;
            }
        }
        return 1;
    }
}