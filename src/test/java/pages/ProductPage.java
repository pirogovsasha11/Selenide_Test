package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ProductPage {
    final SelenideElement exitBtn = $x("//*[text()=' Выход ']");
    final ElementsCollection sidebarBtn = $$x("//*[@class='es-sidebar__item']");

    public void waitPageOpen() {
        exitBtn.should(exist).shouldBe(visible, Duration.ofSeconds(7));
    }

    public void sidebarIsVisible() {
        sidebarBtn.findBy(text("Правила программы лояльности")).shouldBe(visible);
        sidebarBtn.shouldHave(sizeGreaterThan(0));
        sidebarBtn.shouldHave(size(4));
        sidebarBtn.shouldHave(sizeGreaterThanOrEqual(2));
    }
}
