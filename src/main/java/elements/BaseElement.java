package elements;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Logger;
import utils.WaitUtils;

import java.util.List;

public class BaseElement {

    protected String name;
    private By locator;
    private WebDriver driver;
    private static final Logger logger = Logger.getInstance();

    public BaseElement(String name, By locator, WebDriver driver) {
        this.name = name;
        this.locator = locator;
        this.driver = driver;
    }

    public MobileElement getElement(){
        return driver.findElement(locator);
    }

    public List<MobileElement> getElements() {
        return driver.findElements(locator);
    }

    public MobileElement getChildElement(By childLocator, String childElementName) {
        logger.info("Get child element [%s]", childElementName);
        return getElement().findElement(childLocator);
    }

    public void click() {
        logger.info("Click on element [%s]", name);
        getElement().click();
    }

    public boolean isDisplayed() {
        logger.info("Is element [%s] displayed", name);
        return getElement().isDisplayed();
    }

    public String getText() {
        logger.info("Get text from element [%s]", name);
        return getElement().getText();
    }

    public void clearAndType(String text) {
        logger.info("Clear and type text [%s] to element", text, name);
        getElement().clear();
        getElement().sendKeys(text);
    }

    protected boolean waitForText(String text) {
        logger.info("Wait text [%s] from element [%s]", text, name);
        return WaitUtils.waitForTextToBe(text, driver, locator);
    }
}
