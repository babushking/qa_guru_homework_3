package tests;

import com.codeborne.selenide.ElementsCollection;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AlfaArchiveDepozitTests {

    @Test
    void TestAlfaB() {
        open("https://alfabank.ru/");
        $(byText("Вклады")).click();
        $("body").shouldHave(text("Накопительные продукты"));
        $$(byText("Депозиты")).find(visible).parent().click();
        $$(byText("Архивные счета и депозиты")).find(visible).parent().click();
        $$(byText("Депозиты")).find(visible).parent().click();
        $("body").shouldHave(text("Вклады"));
        $$("div[data-widget-name='CatalogCard']").shouldHaveSize(5);
    }
    
    @Test
    void assertTrueTest(){
        assertTrue(3>1);
    }

}
