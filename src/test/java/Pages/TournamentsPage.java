package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TournamentsPage {

    SelenideElement tournamentsTitle = $x("//h1[@class = 'page-title']");
    public String getTournamentsHeader(){
        return tournamentsTitle.text();
    }
}
