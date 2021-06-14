package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Button {

    private final BaseElement element;

    public Button(String name, By locator, WebDriver driver) {
        this.element = new BaseElement(String.format("%s button", name), locator, driver);
    }

    public void click() {
        element.click();
    }

    public boolean waitForText(String text) {
        return element.waitForText(text);
    }

    public boolean waitForVisible() {
        return element.waitForVisible();
    }
}
