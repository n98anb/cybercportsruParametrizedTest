package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class GamesPage {

    SelenideElement gamesTitle = $x("//h1[@class = 'page-title']");
    public String getGamesHeader(){
        return gamesTitle.text();
    }
}
