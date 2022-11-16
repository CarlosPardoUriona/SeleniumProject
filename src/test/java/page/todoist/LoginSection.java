package page.todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginSection {

    public TextBox emailTxtBox = new TextBox(By.xpath("//input[@id='element-0']"));
    public TextBox passwordTxtBox = new TextBox(By.xpath("//input[@id='element-3']"));
    public Button loginButton= new Button(By.xpath("//button[@data-gtm-id='start-email-login']"));


}
