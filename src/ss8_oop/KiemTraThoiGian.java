package ss8_oop;

public class KiemTraThoiGian {
    public static void main(String[] args) {
        ThoiGian a = new ThoiGian();
        a.output();

        ThoiGian b = new ThoiGian(7);
        b.output();

        ThoiGian c = new ThoiGian(7, 30);
        c.output();

        ThoiGian d = new ThoiGian(7,30,54);
        d.output();

        ThoiGian f = new ThoiGian(d);
        f.output();
    }
}
