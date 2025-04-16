package HamXayDung_Constructor;

public class DemoHamXayDung {

    public String name, phone;
    public static String address = "HCM";

    //Hàm xây dựng - có tên hàm giống tên class
    private DemoHamXayDung() {
        name = "Khanh";
        phone = "123456";
    }

    public static void main(String[] args) {

        //Khởi tạo đối tượng class là nó đã chạy cái hàm xây dựng luôn
        DemoHamXayDung demoHamXayDung = new DemoHamXayDung();

        System.out.println(demoHamXayDung.name);
        System.out.println(demoHamXayDung.phone);
    }
}
