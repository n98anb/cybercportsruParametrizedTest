package Tests;

import Pages.MainPage;
import Enum.HeadersEnum;
import Enum.ForEnum;
import Pages.MatchesPage;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static Tests.CybersportRuTest.URL;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParametrizedTestCyber extends BaseTest {
    /*
    Параметризированный тест, проверяющий реальные заголовки страниц с их ожиданиями
     */
    @ParameterizedTest
    @EnumSource(HeadersEnum.class)
    public void enumTest(HeadersEnum type) {
        MainPage mainPage = new MainPage(URL);
        assertEquals(mainPage.getTitle(type),
                ForEnum.testWithEnum(type));
    }

}
