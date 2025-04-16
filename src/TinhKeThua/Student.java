package TinhKeThua;

public class Student extends Person {

    private String phone, address;

    public Student(String name, int age, float height, String phone) {
        //Truyền đối số (arguments)
        super(name, age, height); //Truyền data ngược về class cha
        //Truyền giá trị hoặc biến đúng cấu trúc
//        super("Khanh", 30, 165.5F);
        //Nếu lớp cha có hơn 1 constructor, chỉ dùng hàm super cho 1 constructor
//        super(name);

        this.phone = phone;
        this.address = "HCM";
    }

    public void showInfoStudent() {
        //Dùng từ khóa super để gọi những thành phần từ class cha khi bị trùng với class con
        super.getInfo();
        getName(); //Từ class cha Person

        getInfo();
//        System.out.println("Phone: " + phone); //Từ class con
//        System.out.println("Address: " + address); //Từ class con
    }

    //Ghi đè phương thức từ class cha, hàm ở class con trùng tên với class cha thì class con ghi đè
    public void getInfo() {
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Student student = new Student("Khanh", 30, 165.5F, "123456");
//        student.getInfo();
        student.showInfoStudent();
    }
}
