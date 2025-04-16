package HamXayDung_Constructor;

public class HamXayDungCoThamSo {

    public String name, phone, address;

    //Từ khóa this xuất hiện khi variable và argument trùng tên, sẽ chỉ rõ cái nào thuộc nội bộ cái nào là truyền vào
    public HamXayDungCoThamSo(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    //Nếu khác tên thì không cần dùng từ khóa this
    public HamXayDungCoThamSo(String name1, String phone1) {
        name = name1;
        phone = phone1;
    }

    public static void main(String[] args) {
        HamXayDungCoThamSo hamXayDungCoThamSo = new HamXayDungCoThamSo("Khanh", "123456");

        System.out.println(hamXayDungCoThamSo.name);
        System.out.println(hamXayDungCoThamSo.phone);

        HamXayDungCoThamSo hamXayDungCoThamSo2 = new HamXayDungCoThamSo("Phung", "789012");

        System.out.println(hamXayDungCoThamSo2.name);
        System.out.println(hamXayDungCoThamSo2.phone);

        HamXayDungCoThamSo hamXayDungCoThamSo3 = new HamXayDungCoThamSo("Thao", "345678", "HCM");

        System.out.println(hamXayDungCoThamSo3.name);
        System.out.println(hamXayDungCoThamSo3.phone);
        System.out.println(hamXayDungCoThamSo3.address);
    }
}
