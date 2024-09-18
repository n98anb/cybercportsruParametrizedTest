package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import Enum.HeadersEnum;
import Pages.MatchesPage;

import java.time.Duration;

import static Enum.HeadersEnum.*;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    public MainPage(String url){
        open(url);
    }

    SelenideElement autorizationButton = $x("//button[@class='button_MRo+t desktopOnly_w-2LU']");
    SelenideElement loginArea = $x("//input[@class='input' and not(@type)]");
    SelenideElement passwordArea = $x("//input[@class='input' and @type]");
    SelenideElement entrenceButton = $x("//button[@type='submit']");
    SelenideElement wrongPassword = $x("//*[.='Неверный e-mail или пароль']");
    SelenideElement avatar = $x("//div[@class = 'avatar_BLD9Q']/img");
    SelenideElement matches = $x("//li[@class = 'item_91IAk']/a[@href = '/matches']");
    SelenideElement tournaments = $x("//li[@class = 'item_91IAk']/a[@href = '/tournaments']");
    SelenideElement teams = $x("//li[@class = 'item_91IAk']/a[@href = '/teams']");
    SelenideElement blog = $x("//li[@class = 'item_91IAk']/a[@href = '/blog']");
    SelenideElement games = $x("//li[@class = 'item_91IAk']/a[@href = '/games']");

    public MainPage entranceClick(){
        autorizationButton.click();
        return this;
    }

    public void authorization(String login, String passwor){
        loginArea.setValue(login);
        passwordArea.setValue(passwor);
        entrenceButton.click();
    }

    public boolean checkWrongAuthorization(){
        return wrongPassword.text().equalsIgnoreCase( "Неверный e-mail или пароль");
    }
    public boolean checkTrueAuthorization(){
        if (avatar.is(visible, Duration.ofSeconds(2))){
            avatar.click();
            return true;
        }
        return false;
    }


    public String getTitle(HeadersEnum header){
        return switch (header) {
            case MATCHES:
                sleep(11000);
                matches.click();
                MatchesPage matchesPage = new MatchesPage();
                yield matchesPage.getMatchHeader();
            case TOURNAMENTS:
                sleep(11000);
                tournaments.click();
                TournamentsPage tournamentsPage = new TournamentsPage();
                yield tournamentsPage.getTournamentsHeader();
            case TEAMS:
                sleep(11000);
                teams.click();
                TeamsPage teamsPage = new TeamsPage();
                yield teamsPage.getTeamsHeader();
            case BLOG:
                sleep(11000);
                blog.click();
                BlogPage blogPage = new BlogPage();
                yield blogPage.getBlogHeader();
            case GAMES:
                sleep(11000);
                games.click();
                GamesPage gamesPage = new GamesPage();
                yield gamesPage.getGamesHeader();

        };
    }
}
