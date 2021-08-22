package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class firstContributor {

    @Test
    void firstContributorShouldBeSolntsev(){

        // открыть страничку selenide
        open("https://github.com/selenide/selenide");

        // подвести мышку к первому элементу в области Contributors
        $(".BorderGrid").$(Selectors.byText("Contributors"))
                .closest("div").$("ul li").hover();
        // проверка: в появившемся окошечке (overlay)
        $$(".Popover-message").findBy(visible).shouldHave(text("Andrei Solntsev"));

        sleep(5000);

    }

}
