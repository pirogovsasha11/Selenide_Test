package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    final SelenideElement emailInput = $("[placeholder='Введите Email']");
    final SelenideElement passwordInput = $x("//*[@placeholder='Введите пароль']");
    final SelenideElement clickBtn = $x("//*[text() = 'Войти']");

    public void openPage() {
        open("page/sign-in");
    }

    public void login() {
        emailInput.setValue("liwin31769@pumpoly.com");
        passwordInput.setValue("8wNV8SHD2kg4t!f");
        clickBtn.submit();
    }
}
