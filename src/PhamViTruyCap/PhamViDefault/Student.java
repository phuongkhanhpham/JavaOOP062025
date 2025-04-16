package PhamViTruyCap.PhamViDefault;

import PhamViTruyCap.PhamViPrivate.Company;

public class Student {
    public static void main(String[] args) {

        School school = new School();
        school.getAuthentication();

        Company company = new Company();
//        company.address; //'address' is not public in 'PhamViTruyCap.PhamViPrivate.Company'. Cannot be accessed from outside package
    }
}
