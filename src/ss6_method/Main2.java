package ss6_method;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhâp n:");
        int n = scanner.nextInt();
        if(isPrime(n)){
            System.out.printf("%d là số nguyên tố \n",n );
        }else{
            System.out.printf("%d không phải là số nguyên tố \n",n );
        }

        System.out.println("Tổng số nguyên tố: " + calTotalPrime(n));
    }

    public static boolean isPrime(int n) {
        if(n < 2) {
            return false;
        }
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int calTotalPrime(int n){
        int total = 0;
        while (n !=0){
            if(isPrime(n % 10)){
                total += n %10;
            }
            n /= 10;
        }
        return total;
    }

}

