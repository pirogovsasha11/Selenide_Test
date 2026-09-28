package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void pageIsOpen() {
        loginPage.openPage();
        loginPage.login();
        productPage.waitPageOpen();
        productPage.sidebarIsVisible();
    }
}
