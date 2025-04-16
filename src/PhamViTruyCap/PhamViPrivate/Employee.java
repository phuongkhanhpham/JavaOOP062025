package PhamViTruyCap.PhamViPrivate;

public class Employee {

    private String name = "Phuong Khanh";
    private int age = 29;

    public void getInfo() {
        System.out.println(name);
        System.out.println(age);
    }

    private void getName() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getInfo();

    }
}
