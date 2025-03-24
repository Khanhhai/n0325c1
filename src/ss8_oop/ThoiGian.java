package ss8_oop;

public class ThoiGian {
//    double gio;
//    double phut;
//    double giay;
//

    int gio;
    int phut;
    int giay;

    public ThoiGian(){
        gio = 0;
        phut = 0;
        giay = 0;
    }
    public ThoiGian(int gio){
        this.gio = gio;
        phut = 0;
        giay = 0;
    }
    public ThoiGian(int gio, int phut){
        this.gio = gio;
        this.phut = phut;
        giay = 0;
    }
    public ThoiGian(int gio, int phut,int giay){
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }
    public ThoiGian(ThoiGian other){
        this.gio = other.gio;
        this.phut = other.phut;
        this.giay = other.giay;
    }
    public void output(){
        System.out.printf("%02d:%02d:%02d:\n",gio,phut,giay);
    }
}

