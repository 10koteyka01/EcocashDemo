package pageObjects.pages.aboutUs;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import pageObjects.menu.HeaderMenuPage;
import pageObjects.pages.BasePage;

import static com.codeborne.selenide.Selenide.$;

public class DownloadsPage extends BasePage<HeaderMenuPage> {
    {
        header = new HeaderMenuPage();
        pagePath = "/about/downloads";
    }

    public SelenideElement billerRequirements() {
        return $(Selectors.byTitle("Biller Requirements"));
    }
}
