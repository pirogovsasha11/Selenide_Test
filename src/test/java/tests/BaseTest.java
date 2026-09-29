package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import pages.ProductPage;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest {
    LoginPage loginPage;
    ProductPage productPage;

    @BeforeMethod
    public void setup() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://kixbox.ru/";
        Configuration.browserSize = "1920x1200";
        Configuration.timeout = 8000;
        Configuration.headless = false;
        Configuration.holdBrowserOpen = true;

        loginPage = new LoginPage();
        productPage = new ProductPage();
    }

    @AfterMethod(alwaysRun = true)
    public void close() {
        cookies().clear();
        closeWebDriver();
    }
}
