package PhamViTruyCap.PhamViProtected;

import ObjectClass.Login.LoginTest;
import PhamViTruyCap.Common.BasePage;

public class DashboardPage extends BasePage{

    public void getDriver() {
        System.out.println(driver);
    }

    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();

        System.out.println(loginPage.inputEmail);
        System.out.println(loginPage.inputPassword);

        BasePage basePage = new BasePage();
        //Khác package
//        System.out.println(basePage.driver); //'driver' has protected access in 'PhamViTruyCap.Common.BasePage'

        DashboardPage dashboardPage = new DashboardPage();
        System.out.println(dashboardPage.driver);
    }
}
