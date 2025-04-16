package PhamViTruyCap.PhamViPrivate;

public class Company {

    String address = "HCM";

    public static void main(String[] args) {

        Employee employee = new Employee();

//        employee.age; //'age' has private access in 'PhamViTruyCap.PhamViPrivate.Employee'
        employee.getInfo();
    }
}
