package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ProductPage {
    final SelenideElement ProductBtn = $x("//*[text()=' Выход ']");
    final ElementsCollection TitleBtn = $$x("//*[@class='es-sidebar__item']");

    public void waitPageOpen() {
        ProductBtn.should(exist).shouldBe(visible, Duration.ofSeconds(10));
        TitleBtn.findBy(text("Правила программы лояльности")).shouldBe(visible);
        TitleBtn.shouldHave(sizeGreaterThan(0));
        TitleBtn.shouldHave(size(4));
        TitleBtn.shouldHave(sizeGreaterThanOrEqual(4));
    }
}
