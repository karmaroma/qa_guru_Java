package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragDropTest {
    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
        Configuration.startMaximized = true;
    }
    @Test
    void dragndropTest(){
    open("/drag_and_drop");
    $("#column-a").dragAndDropTo($("#column-b"));
    $("#column-b").shouldHave(text("A"));

    sleep(5000);
    }

}
