package TinhDaHinh;

import java.util.Calendar;

public class Caculator {

    public double tinhTong(double a, double b) {
        return a + b;
    }

    public double tinhTong(double a, double b, double c) {
        return a + b + c;
    }

    public double tinhTong(double a, double b, int c) {
        return a + b + c;
    }


    public static void main(String[] args) {
        Caculator caculator = new Caculator();
        System.out.println(caculator.tinhTong(10, 20));
        System.out.println(caculator.tinhTong(10, 20, 30));
    }
}
