package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Label {

    private final BaseElement element;

    public Label(String name, By locator, WebDriver driver) {
        this.element = new BaseElement(String.format("%s label", name), locator, driver);
    }

    public void click() {
        element.click();
    }

    public String getText(){
        return element.getText();
    }

    public boolean waitForText(String text) {
        return element.waitForText(text);
    }
}
