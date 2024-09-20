package Tests;

import Pages.MainPage;
import com.codeborne.selenide.Selenide;
import org.junit.Assert;

import org.junit.Test;



import static com.codeborne.selenide.Selenide.sleep;

public class CybersportRuTest {

    public final static String URL = "https://www.cybersport.ru/";
    MainPage mainPage = new MainPage(URL);
    String wrongLogin = "bdfbdf";
    String wrongPassword = "bdfzbfg";
    String login = "login"; //для прохождения теста введите правильный логин пользователя, зарегестрированного на сайте
    String password = "password"; //для прохождения теста введите правильный пароль, соответствующий существующему логину
/*
Тест верификации
 */
    @Test
    public void authorizationTestWithWrongPassword(){
        sleep(12000);
        mainPage.entranceClick().authorization(wrongLogin, wrongPassword);
        sleep(2000);
        Assert.assertTrue(mainPage.checkWrongAuthorization());
    }

    /*
Тест авторизации
 */
    @Test
    public void authorizationTestWithTruePassword(){
        sleep(12000);
        mainPage.entranceClick().authorization(login, password);
        sleep(2000);
        Assert.assertTrue(mainPage.checkTrueAuthorization());
    }
}
