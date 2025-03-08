package ss3_java_overview;

/**
 * Tìm giá trị của biến a, i, j
 */
public class Exercise7 {
    public static void main(String[] args) {
        int i = 1, j = 1;
        int a = i++ + j++;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("i++ + j++ = " + a);


    }
}
