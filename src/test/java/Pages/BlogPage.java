package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BlogPage {

    SelenideElement blogTitle = $x("//h1[@class = 'page-title']");
    public String getBlogHeader(){
        return blogTitle.text();
    }
}
