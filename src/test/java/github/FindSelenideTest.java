package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class FindSelenideTest {

    @Test
    void shouldFindSelenideRepository(){
        // открыть страничку гитхаб
        open("https://github.com/");
        // ввести в поле поиска selenide
        // нажать enter
        $("[name=q]").setValue("selenide").pressEnter();
        // выбрать первый найденый проект из списка (кликнуть)
        $$(".repo-list li").first().$("a").click();
        // проверка: в заголовке встречается selenide/selenide
        $("h1").shouldHave(text("selenide / selenide"));

        sleep(5000);
    }
}
