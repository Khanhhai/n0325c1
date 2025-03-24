//package ss8_oop;
//
//import java.util.Enumeration;
//import java.util.Scanner;
//
//public class Fraction {
//    int Denominator; // mẫu số
//    int Numerator; // tử số
//
//    void input() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Nhập tử số: ");
//        Numerator = scanner.nextInt();
//
//        do {
//            System.out.println("Nhập mẫu số khác 0:");
//            Denominator = scanner.nextInt();
//        } while (Denominator == 0);
//    }
//
//    void rutGon() {
//        int uc1n = uocChungLonNhat(Numerator, Denominator);
//        Numerator /= uc1n;
//        Denominator /= uc1n;
//
//        // Đảm bảo mẫu số luôn là dương
//        if (Denominator < 0) {
//            Numerator = -Numerator;
//            Denominator = -Denominator  ;
//        }
//    }
//
//    // Tìm ước chung lớn nhất
//    int uocChungLonNhat(int a, int b) {
//        if (a == 0 || b == 0) {
//            return 1;
//        }
//
//        a = Math.abs(a);
//
//        for (int i = a; i >= 1; i--) {
//            if (a % i == 0 && b % i == 0) {
//                return i;
//            }
//        }
//
//        return 1;
//    }
//    void ouput(){
//        rutGon();
//        if (Denominator == 1){
//            System.out.println(Numerator);
//        }else{
//            System.out.println(Numerator + "/"+ Denominator);
//        }
//    }
//    void calHieu(Phanso phanSoKhac){
//        double tuSoKhac = phanSoKhac.Numerator;
//
//    }
//}