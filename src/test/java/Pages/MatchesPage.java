package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MatchesPage {
    SelenideElement matchesTitle = $x("//h1[@class = 'page-title']");
    public String getMatchHeader(){
        return matchesTitle.text();
    }
}
