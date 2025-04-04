package ss8_oop.Ex1;

public class Student {
    String name;
    double mathScore;
    double literatureScore;

    void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên học sinh: ");
        name = scanner.nextLine();

        System.out.print("Nhập điểm toán: ");
        mathScore = scanner.nextDouble();

        System.out.print("Nhập điểm văn: ");
        literatureScore = scanner.nextDouble();
    }

    double calculateAverageScore() {
        return (mathScore + literatureScore) / 2;
    }

    void output() {
        System.out.println("Tên học sinh là: " + name);
        System.out.println("Điểm toán: " + mathScore);
        System.out.println("Điểm văn: " + literatureScore);
        System.out.println("Điểm trung bình: " + calculateAverageScore());
    }
}
