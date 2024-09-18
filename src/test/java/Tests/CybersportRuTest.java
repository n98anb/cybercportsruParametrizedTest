package Tests;

import Pages.MainPage;
import com.codeborne.selenide.Selenide;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.codeborne.selenide.Selenide.sleep;

public class CybersportRuTest {

    public final static String URL = "https://www.cybersport.ru/";
    MainPage mainPage = new MainPage(URL);
    String wrongLogin = "bdfbdf";
    String wrongPassword = "bdfzbfg";
    String login = "login";
    String password = "password";

    @Test
    public void authorizationTestWithWrongPassword(){
        sleep(12000);
        mainPage.entranceClick().authorization(wrongLogin, wrongPassword);
        sleep(2000);
        Assert.assertTrue(mainPage.checkWrongAuthorization());
    }
    @Test
    public void authorizationTestWithTruePassword(){
        sleep(12000);
        mainPage.entranceClick().authorization(login, password);
        sleep(2000);
        Assert.assertTrue(mainPage.checkTrueAuthorization());
    }
}
