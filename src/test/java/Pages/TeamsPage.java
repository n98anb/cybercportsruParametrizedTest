package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TeamsPage {

    SelenideElement teamsTitle = $x("//h1[@class = 'page-title']");
    public String getTeamsHeader(){
        return teamsTitle.text();
    }
}
