package testSuite.yopmail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import session.Session;

import java.time.Duration;
import java.util.Date;

public class SendMailProjectTest extends TestBase {

    @Test

    public void verifySendMailProject(){
        mainPage.aliasEmaillabel.setText(aliasMail);
        mainPage.checkButton.click();

        emailpage.newMailButton.click();
        Session.getInstance().getBrowser().switchTo().frame("ifmail");
        frameEmail.msgToTextBox.setText(aliasMail+"@yopmail.com");
        frameEmail.subjectTextBox.setText("Email-TEST"+new Date().getTime());
        frameEmail.messsageTextBox.setText("Mensaje de prueba, Saludos.");
        frameEmail.sendMsgButton.click();
        frameEmail.confirmLabel.waitWhileControlIsVisible();

        Assertions.assertTrue(frameEmail.confirmLabel.isControlDisplayed(),"ERROR! the Email was not sent...");
        Session.getInstance().getBrowser().switchTo().defaultContent();

    }

}
