package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Logger;
import utils.WaitUtils;

public class BaseScreen {

    private final String nameScreen;
    private final By locator;
    protected final WebDriver driver;

    public BaseScreen(String nameScreen, By locator, WebDriver driver) {
        this.nameScreen = nameScreen;
        this.locator = locator;
        this.driver = driver;
    }

    public boolean isPresentScreen(){
        Logger.getInstance().info("Is [%s] opened", nameScreen);
        return WaitUtils.waitForVisibilityElement(driver, locator).isDisplayed();
    }
}
