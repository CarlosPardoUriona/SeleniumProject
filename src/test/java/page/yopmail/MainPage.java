package page.yopmail;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class MainPage {
    public TextBox aliasEmaillabel = new TextBox(By.id("login"));
    public Button checkButton = new Button(By.xpath("//button[@title=\"Check Inbox @yopmail.com\"]"));
    //public Button butonSendEmail = new Button(By.xpath("//div[text()='" + aliasEmaillabel + "@yopmail.com" + "']"));
}
