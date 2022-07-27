package mobilePageObjects;

import org.openqa.selenium.WebElement;

import static util.Driver.byId;

public class MobileMainPage extends MobileBasePage{
    public WebElement nextButton() {
        return byId("com.example.myapplication:id/button_first");
    }

    public WebElement textFragment() {
        return byId("com.example.myapplication:id/textview_first");
    }
}
