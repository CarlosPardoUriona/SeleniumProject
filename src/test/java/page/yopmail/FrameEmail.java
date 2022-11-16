package page.yopmail;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

import javax.security.auth.Subject;

public class FrameEmail {
    public Label labelAlias = new Label(By.xpath("//span[text()='<karlitos.p@yopmail.com>']"));
   // public Button newMailButton = new Button(By.id("newmail"));
    public TextBox msgToTextBox = new TextBox(By.id("msgto"));
    public TextBox subjectTextBox = new TextBox(By.id("msgsubject"));
    public TextBox messsageTextBox = new TextBox(By.id("msgbody"));
    public Button sendMsgButton = new Button(By.id("msgsend"));
    public Label confirmLabel = new Label(By.xpath("//div[@id='msgpopmsg']"));
}

    /*FrameEmail  //iframe[@id='ifmail']
            Verify //span[text()='<karlitos.p@yopmail.com>']
    NewEmail button //button [@id='newmail']
    MsgTo textbox //input[@id='msgto']
    Subject textbox //input[@id='msgsubject']
    Message textbox //div[@id='msgbody']
    SendMsg button //button[@id='msgsend']
    confirm label //div[@id='msgpopmsg']*/