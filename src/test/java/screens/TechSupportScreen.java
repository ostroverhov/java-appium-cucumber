package screens;

import elements.Button;
import elements.Label;
import elements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TechSupportScreen extends BaseScreen{

    public TechSupportScreen(WebDriver driver) {
        super("Tech support screen", By.id("com.zdv.secretcloset:id/tvTitle"), driver);
    }

    private Button sendButton = new Button("Send", By.id("com.zdv.secretcloset:id/supportSendMessage"), driver);
    private TextBox messageTextBox = new TextBox("Message", By.id("com.zdv.secretcloset:id/supportMessageType"), driver);
    private Button sendMessageButton = new Button("Send message", By.id("com.zdv.secretcloset:id/buttonSend"), driver);
    private Label supportMessageLabel = new Label("Support message", By.id("com.zdv.secretcloset:id/supportQuestionMessageContent"), driver);

    public void clickSendButton() {
        sendButton.click();
    }

    public void typeMessage(String message) {
        messageTextBox.waitForVisible();
        messageTextBox.clearAndType(message);
    }

    public void clickSendMessageButton() {
        sendMessageButton.click();
    }

    public boolean isSupportMessagePresent(String text) {
        return supportMessageLabel.waitForText(text);
    }
}
