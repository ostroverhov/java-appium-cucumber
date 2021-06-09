package screens;

import elements.Button;
import enums.SideMenuItem;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SideMenuForm extends BaseScreen{

    public SideMenuForm(WebDriver driver) {
        super("Side menu", By.id("com.zdv.secretcloset:id/left_drawer"), driver);
    }

    private Button menuItemButton(SideMenuItem sideMenuItem) {
        return new Button("Menu item " + sideMenuItem, By.id(String.format("com.zdv.secretcloset:id/%s", sideMenuItem.getLocator())), driver);
    }

    public void clickMenuItem(SideMenuItem sideMenuItem) {
        menuItemButton(sideMenuItem).click();
    }

    public boolean IsUserStatusPresent(String status) {
        return menuItemButton(SideMenuItem.STATUS).waitForText(status);
    }
}
