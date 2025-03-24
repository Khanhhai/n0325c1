package ss8_oop;

import java.util.Scanner;

public class Student {
    String name;
    double mathScore;
    double literatureScore;

    void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên học sinh: ");
        name = scanner.nextLine();

        System.out.print("Nhập điểm toán: ");
        mathScore = scanner.nextDouble();

        System.out.print("Nhập điểm toán: ");
        mathScore = scanner.nextDouble();
    }
    double calculateAverageScore(){
        return ( mathScore + literatureScore)/2;
    }
    void ouputData(){
        System.out.println("Tên học sinh: "+ name);
        System.out.println("Điểm toán: "+ mathScore);
        System.out.println("Điểm văn: "+ literatureScore);
        System.out.println("Điểm trung bình: "+ calculateAverageScore());
    }
}