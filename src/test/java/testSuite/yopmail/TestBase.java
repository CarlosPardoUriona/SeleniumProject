package testSuite.yopmail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.yopmail.EmailPage;
import page.yopmail.FrameEmail;
import page.yopmail.FrameInbox;
import page.yopmail.MainPage;
import session.Session;
import util.YopMailGetProperties;

public class TestBase {
    MainPage mainPage = new MainPage();
    FrameEmail frameEmail = new FrameEmail();
    EmailPage emailpage = new EmailPage();
    //EmailPage emailPage = new EmailPage();
    String aliasMail = YopMailGetProperties.getInstance().getAliasEmail();

    @BeforeEach
    public void openBrowser(){

        Session.getInstance().getBrowser().get(YopMailGetProperties.getInstance().getHost());
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }
}
