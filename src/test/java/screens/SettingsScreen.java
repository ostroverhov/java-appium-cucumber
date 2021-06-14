package screens;

import elements.Label;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SettingsScreen extends BaseScreen {

    public SettingsScreen(WebDriver driver) {
        super("Settings screen", By.id("com.zdv.secretcloset:id/rlProfileMain"), driver);
    }

    private Label nameLabel = new Label("Name", By.id("com.zdv.secretcloset:id/tvProfileNickName"), driver);
    private Label emailLabel = new Label("Email", By.id("com.zdv.secretcloset:id/tvProfileEmail"), driver);

    public String getName() {
        return nameLabel.getText();
    }

    public String getEmail() {
        return emailLabel.getText();
    }
}
