package TinhDongGoi;

public class LoginPage {

    private String email, password;
    private String url = "https://crm.anhtester.com";

    private String phone, address;
    private int role;

    public LoginPage(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public LoginPage() {
    }

    public LoginPage(String email, String password, String url, String phone, String address, int role) {
        this.email = email;
        this.password = password;
        this.url = url;
        this.phone = phone;
        this.address = address;
        this.role = role;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        System.out.println("Open URL CRM");
        System.out.println("Save log to report");
        return url;
    }

    public String getUrlLoginAdmin(String url) {
        return url + "/admin/authentication";
    }

    public String getUrlLoginCustomer(String url) {
        return url + "/authentication/login";
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public void setUrl(String url) {
//        this.url = url;
//    }

    public void loginCRM() {
        System.out.println("Open URL: " + getUrl());
        System.out.println("Enter email: " + getEmail());
        System.out.println("Enter password: " + getPassword());
    }

    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
//        loginPage.setUrl("https://crm.anhtester.com/admin/authentication");
        loginPage.setEmail("admin@example.com");
        loginPage.setPassword("123456");

        loginPage.loginCRM();

        LoginPage loginPage2 = new LoginPage();
//        loginPage2.setUrl("https://crm.anhtester.com/admin/authentication");
        loginPage2.setEmail("customer@example.com");
        loginPage2.setPassword("123456");

        loginPage2.loginCRM();
    }
}
