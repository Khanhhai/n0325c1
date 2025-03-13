package ss6_method;

public class Main1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;

        int total = calTotal(a, b);
        total = calTotal(a , b)+c;
        System.out.println("Total " + total);
    }
    public static int calTotal ( int a, int b){
        int total = a + b;
        return total;
    }
}
